
// import java.awt.*;
import javax.swing.*;

import java.applet.Applet;
import java.awt.event.*;

public class Q2017_5 extends Applet implements ActionListener {
    JFrame jf;
    JTextField t1, t2, t3;
    JLabel result;
    JButton b, b1;

    public void init() {
        jf = new JFrame();
        t1 = new JTextField();
        t1.setBounds(20, 20, 50, 20);
        t2 = new JTextField();
        t2.setBounds(20, 50, 50, 20);
        t3 = new JTextField();
        t3.setBounds(80, 50, 50, 20);

        b = new JButton("ADD");
        b.setBounds(20, 80, 50, 50);
        b.setActionCommand("Add");

        b1 = new JButton("Sub");
        b1.setBounds(80, 80, 50, 50);
        b1.setActionCommand("Sub");

        result = new JLabel("Result");
        result.setBounds(20, 150, 100, 40);

        // jf.setLayout(new GridLayout(4, 1));
        jf.add(t1);
        jf.add(t2);
        jf.add(t3);
        jf.add(b);
        jf.add(b1);
        jf.add(result);
        jf.setSize(800, 800);
        jf.setLayout(null);
        jf.setVisible(true);
    }

    public void start() {
        b.addActionListener(this);
        b1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        int n3 = Integer.parseInt(t3.getText());
        int s = n1 + n2 + n3;
        int s1 = n1 - n2 - n3;
        if (cmd == "Add") {
            result.setText(" " + s);
        }
        if (cmd == "Sub") {
            result.setText(" " + s1);
        }
    }

}

/* <applet class="Q2017_5" height="400" width="400" > </applet> */
