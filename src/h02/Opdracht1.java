package h02;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    // VARIABELEM DECLAREREN
    String voornaam;

    public void init() {

     //VARIABELEN INTIALISEREN
     voornaam = "Damian";
     setSize(400,400);
     setBackground(Color.BLUE);

    }

    public void paint(Graphics g) {

       // DINGEN IN BEELD BRENGEN

       // Color.Yellow werkt niet. Andere kleuren wel

        g.setColor(Color.YELLOW);
        g.drawString(voornaam, 20, 20);



    }
}
