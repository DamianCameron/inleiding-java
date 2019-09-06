package h03;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {

    public void init() {
        setBackground(Color.pink);
        setSize(400,400);
            }

    public void paint(Graphics g) {

        //cube
        g.setColor(Color.WHITE);
        g.fillRoundRect(50,50,300,300,30,30);

        //dots
        g.setColor(Color.BLACK);
        g.fillOval(100,100,50,50);
        g.fillOval(250,100,50,50);
        g.fillOval(100,250,50,50);
        g.fillOval(250,250,50,50);
            }
}
