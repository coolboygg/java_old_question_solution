import java.awt.event.*;
import javax.swing.*;

public class Q2017_6 {
    public static void main(String[] args) {
        Q2017_6 q = new Q2017_6();
        q.Q2017();
    }

    JFrame jf;
    JComboBox<String> jc;
    JTextField jt;

    String[] days = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    public void Q2017() {
        jf = new JFrame();

        jc = new JComboBox<String>(days);
        jc.setBounds(20, 20, 80, 40);
        jf.add(jc);

        jt = new JTextField("Selected Items");
        jt.setBounds(20, 100, 50, 40);
        jf.add(jt);

        jc.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {

                jt.setText("" + jc.getSelectedItem());

            }
        });
        jf.setSize(500, 500);
        jf.setLayout(null);
        jf.setVisible(true);

    }

}
