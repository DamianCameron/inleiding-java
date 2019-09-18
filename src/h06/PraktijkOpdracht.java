package h06;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {

    String tekst;

    double cijfer1, cijfer2, cijfer3, gedeeld, uitkomst, tien;


    public void init() {

        tekst = "het gemiddelde cijfer = ";

        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        gedeeld = 3;
        tien = 10;
        uitkomst = (cijfer1 + cijfer2 + cijfer3) / gedeeld;
        uitkomst *= 10;
        uitkomst = (int) uitkomst;
        uitkomst = uitkomst / 10;

            }

    public void paint(Graphics g) {

        g.drawString(tekst + uitkomst,50,50);

            }


}
