import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Button extends JPanel{
    //Variables for buttons
    private JButton addTask;
    private JButton deleteTasks;

    Border emptyBorder=BorderFactory.createEmptyBorder();

    //Constructor
    Button() {
        //Sets size and background colors for buttons
        this.setPreferredSize(new Dimension(600, 75));
        this.setBackground(Color.gray);

        //Add task button
        addTask= new JButton("Add Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans=serif", Font.PLAIN, 20));

        //Clear tasks button
        deleteTasks= new JButton("Delete all Done Tasks");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans=serif", Font.PLAIN, 20));

        this.add(addTask);
        this.add(Box.createHorizontalStrut(100));
        this.add(deleteTasks);
    }

    public JButton getAddTask() {
        return addTask;
    }

    public JButton getDeleteTasks() {
        return deleteTasks;
    }
}
