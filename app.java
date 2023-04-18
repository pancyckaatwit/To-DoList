import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// Will be the JFrame for the project
// JFrame represents the framed area for the project while JPanel is a specific area within the frame
public class App extends JFrame {
    // Variables
    private Title titlePanel;
    private Button buttonPanel;
    private List l;

    private JButton addTask;
    private JButton deleteTasks;

    //Constructor for app
    App() {
        //Declares the three variables
        titlePanel=new Title();
        buttonPanel=new Button();
        l=new List();

        //Sets the size and ruleset for JFrame
        // The width of the window for the app is 600 while the height of the window is 800
        this.setSize(600, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        //Implements title class using titlePanel
        this.add(titlePanel, BorderLayout.NORTH);
        //Implements button class using buttonPanel
        this.add(buttonPanel, BorderLayout.SOUTH);
        //Implements list class using l
        this.add(l, BorderLayout.CENTER);

        addTask=buttonPanel.getAddTask();
        deleteTasks=buttonPanel.getDeleteTasks();

        addListeners();
    }

    //Response given to mouse when user clicks a button
    public void addListeners() {
        //For the add task and done buttons
        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent event) {
                Task task=new Task();
                //Adds a task to the list
                l.add(task);
                //Calls method from List to update the indexx numbers
                l.updateTaskNumbers();
                task.getDoneButton().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        task.changeState();
                        //Revalidate tells the layout manager to recalculate the layout that is necessary when adding componenets
                        revalidate();
                    }
                });
                //Revalidate tells the layout manager to recalculate the layout that is necessary when adding componenets
                revalidate();
            }
        });
        
        //For the delete tasks button
        deleteTasks.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                l.removeDoneTasks();
                repaint();
            }
        });
    }
}
