import javax.swing.JFrame;

import java.awt.BorderLayout;

// Will be the JFrame for the project
// JFrame represents the framed area for the project while JPanel is a specific area within the frame
public class app extends JFrame {
    // Variables
    private title titlePanel;
    private button buttonPanel;
    private list l;

    //Constructor for app
    app() {
        //Declares the three variables
        titlePanel=new title();
        buttonPanel=new button();
        l=new list();

        //Sets the size and ruleset for JFrame
        // The width of the window for the app is 600 while the height of the window is 800
        this.setSize(600, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        //Implements title class using titlePanel
        this.add(titlePanel, BorderLayout.NORTH);
    }
}
