package h012;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    double[] test;
    double totaal = 0;

    public void init() {

        test = new double[10];

        for (int teller = 0; teller < test.length; teller++) {
            test[teller] = 100 * (teller + 1);

        }

        for (int i=0; i<test.length; i++) {
            totaal = totaal + test[i];
        }


    }

    public void paint(Graphics g) {

        for (int teller = 0; teller < test.length; teller++) {
            g.drawString("" + test[teller], 50, 20 * teller + 20);

            double average = totaal / test.length;

            g.drawString("het gemidelde = " + average,100,20);
        }
    }
}
