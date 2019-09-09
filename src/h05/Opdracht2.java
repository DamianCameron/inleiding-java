package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    String blauw;
    String rood;
    String geel;

    int hoogte;

    int jeroen;
    int hans;
    int valerie;

    public void init() {
        setSize(400,400);
        setBackground(Color.pink);

        blauw = "Jeroen";
        rood = "Hans";
        geel = "Valerie";

        hoogte = 0;

        jeroen = 100; //gewicht van Jeroen
        hans = 80; //gewicht van Hans
        valerie = 40; //gewicht van Valerie

    }

    public void paint(Graphics g) {

        //statistieken
        g.setColor(Color.GRAY);
        g.fillRect(0,360,400,40);//UI

        g.setColor(Color.BLUE);
        g.fillRect(50,360-jeroen,50,jeroen);//Jeroen

        g.setColor(Color.red);
        g.fillRect(150,360-hans,50,hans);//Hans

        g.setColor(Color.YELLOW);
        g.fillRect(250,360-valerie,50,valerie);//Valerie

        //Namen
        g.setColor(Color.green);
        g.drawString(blauw,50,380);
        g.drawString(rood,150,380);
        g.drawString(geel,250,380);
    }
}
