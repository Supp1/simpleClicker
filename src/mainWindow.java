import javax.swing.*;
import java.awt.*;

public class mainWindow extends JFrame {
    mainWindow(){
        setLayout(null);
        setBackground(Color.BLUE);
        setTitle("Мой проект");
        setSize(480,505);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(new myPanel());
        setResizable(false);
    }
    public static void main(String[] args){
        mainWindow mw = new mainWindow();
        mw.setVisible(true);
    }
}
