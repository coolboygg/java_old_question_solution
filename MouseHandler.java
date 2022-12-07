import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;

public class MouseHandler extends Applet implements MouseListener {
    String msg = "";

    public void init() {
        addMouseListener(this);
    }

    public void start() {
        System.out.println("Started.");
    }

    public void mouseEntered(MouseEvent e) {
        showStatus("Mouse has enetered");

    }

    public void mouseExited(MouseEvent e) {
        showStatus("Mouse has enxited");

    }

    public void mousePressed(MouseEvent e) {
        showStatus("Mouse has pressed");
        msg = msg + "Mouse pressed success.";
        repaint();
    }

    public void mouseClicked(MouseEvent e) {
        showStatus("Mouse has clicked");
        msg = msg + "Mouse clicked success.";
        repaint();

    }

    public void mouseReleased(MouseEvent e) {
        showStatus("Mouse has released");

    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 50);

    }

}
/*
 * <applet code="MouseHandler" height="500" width="500">
 * </applet>
 * 
 */
