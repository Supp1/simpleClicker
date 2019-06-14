import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenu extends JPanel {
    JButton starGame = new JButton("Start the Game!");
    JButton exit = new JButton("Exit");
    mainMenu(){

    }

    class action implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}