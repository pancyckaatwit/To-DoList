import javax.swing.JFrame;

import java.awt.BorderLayout;

// Will be the JFrame for the project
// JFrame represents the framed area for the project while JPanel is a specific area within the frame
public class App extends JFrame {
    // Variables
    private Title titlePanel;
    private Button buttonPanel;
    private List l;

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
        this.add(buttonPanel, BorderLayout.SOUTH);
    }
}
