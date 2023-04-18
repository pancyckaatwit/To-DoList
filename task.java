import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler;

public class Task extends JPanel{
    //Variables for an individual task
    private JLabel index;
    private JTextField taskName;
    private JButton doneButton;
    private boolean done;
    //Constructor
    Task() {
        //Size for a task
        this.setPreferredSize(new Dimension(40, 20));
        this.setLayout(new BorderLayout());

        done=false;

        //Index layout
        index=new JLabel("");
        index.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        
        //Task name layout
        taskName=new JTextField("Enter task here");
        taskName.setBorder(BorderFactory.createEmptyBorder());

        //Done button layout
        doneButton=new JButton("Done");
        doneButton.setPreferredSize(new Dimension(40, 20));
        doneButton.setBorder(BorderFactory.createEmptyBorder());
        
        this.add(index, BorderLayout.WEST);
        this.add(taskName, BorderLayout.CENTER);
        this.add(doneButton, BorderLayout.EAST);
    }

    public JButton getDoneButton() {
        return doneButton;
    }

    public boolean getState() {
        return done;
    }
    //Changes the index of a task on the list to the appropriate one. This gets called in updateTaskNumbers.
    public void changeIndex(int indexNumber) {
        this.index.setText(indexNumber+"");
        //Revalidate tells the layout manager to recalculate the layout that is necessary when adding componenets
        this.revalidate();
    }

    //When the done button for a specific task is pressed the task turns green
    public void changeState() {
        this.setBackground(Color.GREEN);
        taskName.setBackground(Color.GREEN);
        done=true;
    }
}
