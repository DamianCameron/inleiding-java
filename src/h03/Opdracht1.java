package h03;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    public void init() {
        setSize(400,400); //canvas size
    }

    public void paint(Graphics g) {

        g.drawLine(0,400,200,0); //links
        g.drawLine(400,400,200,0); //rechts
        g.drawLine(0,400,400,400); //onder

            }
}
