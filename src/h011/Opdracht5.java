package h011;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    public void init() {

        setSize(500,500);

            }

    public void paint(Graphics g) {

        int teller = 0;
        int x = 50;
        int y = 70;

        while (teller < 10) {
            g.drawRect(x,y,25,25);
            teller++;
            x += 25;
            y += 25;

        }

    }
}
