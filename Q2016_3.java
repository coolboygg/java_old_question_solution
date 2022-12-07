import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Q2016_3 extends Applet implements KeyListener {
    TextField t1;
    Label lab;

    public void init() {
        t1 = new TextField();
        add(t1);
        lab = new Label();
        add(lab);
        setSize(300, 300);
        setLayout(new GridLayout(2, 1));
    }

    public void start() {
        t1.addKeyListener(this);
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
        String a = t1.getText();
        if (a.length() == 5) {
            lab.setText(a + " is of length 5");
        } else {
            lab.setText(a + " is not of length 5");
        }
    }
}