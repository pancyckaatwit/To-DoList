import javax.swing.JFrame;

// Will be the JFrame for the project
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
        this.setSize(600, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
