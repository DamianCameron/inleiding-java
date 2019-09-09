package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    String jan;
    String ali;
    String jaenette;
    String damian;

    int totaalbedrag;
    int personen;

    String uigerekend;

    public void init() {

        jan = "Jan: ";
        ali = "Ali: ";
        jaenette = "jaenette: ";
        damian = "Damian: ";

        totaalbedrag = 113; //totaal verdiend bedrag
        personen = 4; //aantal personen


    }


    public void paint(Graphics g) {

        g.drawString(jan + totaalbedrag/personen,50,50);
        g.drawString(ali + totaalbedrag/personen,50,70);
        g.drawString(jaenette + totaalbedrag/personen,50,90);
        g.drawString(damian + totaalbedrag/personen,50,110);

            }
}

