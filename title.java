import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

// Will handle the title bar section of the todo list
public class Title extends JPanel{
    //Constructor for title
    Title() {
        // JLabel for the text of the title
        JLabel titleText=new JLabel("To Do List");
        // Dimension handles the width and height of an element (In this case the title)
        titleText.setPreferredSize(new Dimension(600, 80));
        // Handles the font of the title
        titleText.setFont(new Font("Sans=serif", Font.BOLD, 40));
        // Handles the color of the font
        titleText.setForeground(Color.BLACK);
        // Handles the location of the text for the title
        titleText.setHorizontalAlignment(JLabel.CENTER);
        // Handles the background color of the title
        this.setBackground(Color.LIGHT_GRAY);

        this.add(titleText);
    }
}
