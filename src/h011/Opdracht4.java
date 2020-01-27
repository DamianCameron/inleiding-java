package h011;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    public void init() {

        setSize(500,500);

            }

    public void paint(Graphics g) {

        int teller = 0;
        int x = 50;
        int y = 70;

        int a = 1;
        int b = 3;

        while (teller < 10) {
            g.drawString(a + "x" + b + "=" + (a * b) + "", x, y);
            teller++;
            y += 20;
            a += 1;
        }
    }
}
