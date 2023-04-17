import java.awt.GridLayout;

import javax.swing.JPanel;

public class List extends JPanel{
    List() {
        //Potential layout for list of tasks
        GridLayout layout= new GridLayout(10, 1);
        layout.setVgap(8);

        this.setLayout(layout);
    }
}
