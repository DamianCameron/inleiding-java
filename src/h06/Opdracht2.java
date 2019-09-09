package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    String minuut;
    String uur;
    String dag;
    String maand;
    String jaar;

    int seconde;

    public void init() {

        minuut = "1 minuut = ";
        uur = "1 uur = " ;
        dag = "1 dag = ";
        maand = "1 maand = ";
        jaar = "1 jaar = ";

        seconde = 1;

            }


    public void paint(Graphics g) {

        g.drawString(minuut + seconde * 60,50,50);
        g.drawString(uur + seconde * 60 * 60,50,70);
        g.drawString( dag + seconde * 60 * 60 * 24,50,90);
        g.drawString( maand + seconde * 60 * 60 * 24 * 30, 50 ,110);
        g.drawString( jaar + seconde * 60 * 60 * 24 * 365, 50 ,130);

            }
}
