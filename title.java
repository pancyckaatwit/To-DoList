import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

// Will handle the title bar section of the todo list
public class title extends JPanel{

    //Constructor for title
    title() {
        // Dimension handles the width and height of an element (In this case the title)
        this.setPreferredSize(new Dimension(600, 100));
        //Handles the color of the title
        this.setBackground(Color.blue);
        
    }
}
