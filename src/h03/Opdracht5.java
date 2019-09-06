package h03;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    public void init() {
        setBackground(Color.BLUE);
        setSize(400,400);
            }

    public void paint(Graphics g) {

        g.setColor(Color.YELLOW);
        g.fillArc(50,50,300,300,350,350);//pacman

        g.setColor(Color.BLACK);
        g.fillOval(280,150,30,30); //oog
            }
}
