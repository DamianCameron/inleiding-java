package h011;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {


    public void init() {
    }


    public void paint(Graphics g) {

        int x = 50;
        int y = 70;
        int t1 = 0;
        int t2 = 1;
        int teller;
        int n;

        for(teller = 0; teller < 20; teller++) {

            g.drawString("" + t1, x, y);

            x += 30;

            n = t2;
            t2 = t1 + t2;
            t1 = n;
        }

    }




}
