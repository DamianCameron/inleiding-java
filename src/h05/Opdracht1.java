package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    String lijn;
    String rechthoek;
    String gevulderechthoekovaal;
    String taartpunt;
    String ronderechthoek;
    String ovaal;
    String cirkel;

    Color vulling;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        setSize(1200,600);
        setBackground(Color.pink);

        lijn = "lijn";
        rechthoek = "Rechthoek";
        gevulderechthoekovaal = "Gevulde rechthoek met ovaal";
        taartpunt = "Taartpunt met ovaal er om heem";
        ronderechthoek = "Afgeronde rechthoek";
        ovaal = "Ovaal";
        cirkel = "Cirkel";

        vulling = Color.red;
        lijnkleur = Color.BLACK;
        breedte = 340;
        hoogte = 200;
    }

    public void paint(Graphics g) {

        //Lijn
        g.drawLine(30,30,370,30);
        g.drawString(lijn,30,50);

        //Rechthoek
        g.drawRect(30,80,breedte,hoogte);
        g.drawString(rechthoek,30,300);

        //Rechthoek gevuld
        g.setColor(vulling);
        g.fillRect(430,80,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawOval(430,80,breedte,hoogte);
        g.drawString(gevulderechthoekovaal,430,300);

        //Taartpunt
        g.drawOval(830,80,breedte,hoogte);
        g.drawString(taartpunt,830,300);
        g.setColor(vulling);
        g.fillArc(830,80,breedte,hoogte,0,45);

        //Afgeronde Rechthoek
        g.setColor(lijnkleur);
        g.drawRoundRect(30,310,breedte,hoogte,30,30);
        g.drawString(ronderechthoek, 30, 530);

        //Ovaal
        g.drawString(ovaal,430,530);
        g.setColor(vulling);
        g.fillOval(430,310,breedte,hoogte);

        //Cirkel
        g.setColor(lijnkleur);
        g.drawOval(900,310,200,200);
        g.drawString(cirkel,830,530);
    }
}
