package h011;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int y = 0;

        while(teller < 10) {
            y += 20;
            g.drawLine(50, y, 300, y );
            teller++;
        }
    }
}
