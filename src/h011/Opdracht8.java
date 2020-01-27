package h011;

import java.applet.Applet;
import java.awt.*;

public class Opdracht8 extends Applet {

    public void init() {



            }

    public void paint(Graphics g) {

        int teller = 0;
        int w = 10;
        int h = 10;

        while (teller < 100) {
            g.drawOval(225,225,w,h);
            teller++;
            w += 10;
            h +=10;
        }

    }
}
