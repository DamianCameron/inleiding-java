package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    public void init() {
        setSize(400,400);
        setBackground(Color.BLUE);
            }

    public void paint(Graphics g) {

        //pole
        g.setColor(Color.DARK_GRAY);
        g.fillRect(150,100,100,280);
        g.fillRect(175,380,50,20);

        //lights
        g.setColor(Color.red);
        g.fillOval(175,125,50,50);

        g.setColor(Color.ORANGE);
        g.fillOval(175,200,50,50);

        g.setColor(Color.green);
        g.fillOval(175,275,50,50);
            }
}
