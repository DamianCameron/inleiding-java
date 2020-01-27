package h011;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {

    public void init() {

        setSize(500,500);

            }

    public void paint(Graphics g) {

        int teller = 0;
        int x = 200;
        int y = 200;

        int w = 50;
        int h = 50;

        while (teller <5) {
            g.drawOval(x,y,w,h);
            teller++;
            x -= 10;
            y -= 10;
            w += 20;
            h += 20;

        }

    }

}
