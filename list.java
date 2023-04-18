import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class List extends JPanel{
    List() {
        //Potential layout for list of tasks
        GridLayout layout= new GridLayout(10, 1);
        layout.setVgap(8);

        this.setLayout(layout);
    }

    //Deals with the numbering of tasks
    public void updateTaskNumbers() {
        Component[] listItems=this.getComponents();
        for(int i=0; i<listItems.length; i++) {
            if(listItems[i] instanceof Task) {
                ((Task)listItems[i]).changeIndex(i+1);
            }
        }
    }

    //Method for done tasks button
    public void removeDoneTasks() {
        for(Component i: getComponents()) {
            if(i instanceof Task) {
                if(((Task)i).getState()) {
                    remove(i);
                    updateTaskNumbers();
                }
            }

        }
    }
}
