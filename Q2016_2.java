
// import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Q2016_2 implements ActionListener {
    JFrame jf;
    JTextField t1, t2;
    JLabel sum;
    JButton b;

    public void Q2016() {
        jf = new JFrame();
        t1 = new JTextField();
        t1.setBounds(20, 20, 50, 20);
        t2 = new JTextField();
        t2.setBounds(20, 50, 50, 20);

        b = new JButton("Add");
        b.setBounds(20, 80, 30, 20);
        sum = new JLabel("");
        sum.setBounds(20, 110, 30, 20);

        b.addActionListener(this);

        // jf.setLayout(new GridLayout(4, 1));
        jf.add(t1);
        jf.add(t2);
        jf.add(b);
        jf.add(sum);
        jf.setSize(800, 800);
        jf.setLayout(null);
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        int s = n1 + n2;
        sum.setText(" " + s);
    }

    public static void main(String[] args) {
        Q2016_2 q2 = new Q2016_2();
        q2.Q2016();
    }
}