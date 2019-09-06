package h02;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    // VARIABELEM DECLAREREN
    String voornaam;
    String achternaam;

    public void init() {

        //VARIABELEN INTIALISEREN
        voornaam = "Damian";
        achternaam = "Driehuis";
        setSize(400,400);
        setBackground(Color.WHITE);

    }

    public void paint(Graphics g) {

        // DINGEN IN BEELD BRENGEN

        g.setColor(Color.BLUE);
        g.drawString(voornaam, 20, 20);

        g.setColor(Color.RED);
        g.drawString(achternaam, 20, 40);


    }
}
