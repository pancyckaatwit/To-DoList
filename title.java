import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

// Will handle the title bar section of the todo list
public class Title extends JPanel{

    //Constructor for title
    Title() {
        // Dimension handles the width and height of an element (In this case the title)
        this.setPreferredSize(new Dimension(600, 80));
        //Handles the color of the title (TEMPORARY)
        this.setBackground(Color.blue);
        
    }
}
