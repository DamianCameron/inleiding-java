package h011;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends Applet {

    public void init() {

        setSize(1000,1000);

            }

    public void paint(Graphics g) {

        int teller = 0;
        int x = 200;
        int y = 200;
        int w = 10;
        int h = 10;

        while (teller < 50) {
            g.drawOval(x,y,w,h);
            teller++;
            x -= 10;
            y -= 10;
            w += 20;
            h += 20;
        }

            }
}
