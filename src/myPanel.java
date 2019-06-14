import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myPanel extends JPanel {
    int num;
    JButton Click1 = new JButton("1 point");
    JButton Click2 = new JButton("2 points");
    JButton Exit = new JButton("Exit");
    JTextField Num = new JTextField();
    Image backgr;
    myPanel() {
        setLayout(null);
        init();
        this.setVisible(true);
    }

    public void init() {
        num = 0;
        add(Click1);
        Click1.setBounds(40, 100, 100, 40);
        add(Click2);
        Click2.setBounds(40, 200, 100, 40);
        add(Exit);
        Exit.setBounds(300, 400, 100, 40);
        add(Num);
        Num.setBounds(40, 300, 40, 50);
        Num.setEditable(false);
        Click1.addActionListener(new clickListener(1));
        Click2.addActionListener(new clickListener(2));
        Exit.addActionListener(new CloseListener());
    }

    class clickListener extends AbstractAction implements ActionListener {
        int increase;
        public clickListener(int inc) {
            increase = inc;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            num += increase;
            Num.setText(Integer.toString(num));
        }
    }

    class CloseListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        ImageIcon iia = new ImageIcon("Yamato.(Kantai.Collection).full.1907714.png");
        backgr = iia.getImage();
        super.paintComponent(g);
        g.drawImage(backgr, 0, 0, this);
    }
}