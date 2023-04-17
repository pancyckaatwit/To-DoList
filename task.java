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
        taskName.setBackground(Color.RED);

        //Done button layout
        doneButton=new JButton("Done");
        doneButton.setPreferredSize(new Dimension(40, 20));
        doneButton.setBorder(BorderFactory.createEmptyBorder());
        
        this.add(index, BorderLayout.WEST);
        this.add(taskName, BorderLayout.CENTER);
        this.add(doneButton, BorderLayout.EAST);
    }
}
