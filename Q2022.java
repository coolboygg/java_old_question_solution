import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Q2022 implements ActionListener {
    JFrame f;
    JTextField jtf1, jtf2, jtf3;

    public void Q2022_6() {
        f = new JFrame("Swing based frame");

        JLabel jl = new JLabel("Nums:");
        jl.setBounds(10, 10, 100, 50);
        f.add(jl);

        jtf1 = new JTextField();
        jtf1.setText("N1");
        jtf1.setBounds(80, 10, 100, 50);
        jtf1.setBackground(Color.YELLOW);
        f.add(jtf1);

        jtf2 = new JTextField();
        jtf2.setText("N2");
        jtf2.setBounds(190, 10, 100, 50);
        jtf2.setBackground(Color.YELLOW);
        f.add(jtf2);

        JButton jb1 = new JButton("LARGE");
        jb1.setBounds(20, 100, 100, 100);
        jb1.setBackground(Color.GRAY);
        jb1.addActionListener((ActionListener) this);
        jb1.setActionCommand("Large");
        f.add(jb1);

        JButton jb2 = new JButton("SMALL");
        jb2.setBounds(150, 100, 100, 100);
        jb2.setBackground(Color.GRAY);
        jb2.addActionListener((ActionListener) this);
        jb2.setActionCommand("Small");
        f.add(jb2);

        jtf3 = new JTextField();
        jtf3.setText("ANSWER");
        jtf3.setBounds(20, 300, 100, 50);
        jtf3.setBackground(Color.YELLOW);
        f.add(jtf3);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        Q2022 si = new Q2022();
        si.Q2022_6();
    }

    String cmd;

    @Override
    public void actionPerformed(ActionEvent e) {
        cmd = e.getActionCommand();
        String a, b;
        a = jtf1.getText();
        b = jtf2.getText();
        System.out.println(cmd);
        if (cmd == "Large") {

            if (Integer.parseInt(a) > Integer.parseInt(b)) {
                jtf3.setText(a);
                f.add(jtf3);

            }
        }
        if (cmd == "Small") {
            if (Integer.parseInt(a) > Integer.parseInt(b)) {
                jtf3.setText(b);
                f.add(jtf3);

            }

        }
    }
}