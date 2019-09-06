package h03;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdracht extends Applet {

            String lijn;
            String rechthoek;
            String gevulderechthoekovaal;
            String taartpunt;
            String ronderechthoek;
            String ovaal;
            String cirkel;

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
            }

    public void paint(Graphics g) {

        //Lijn
        g.drawLine(30,30,370,30);
        g.drawString(lijn,30,50);

        //Rechthoek
        g.drawRect(30,80,340,200);
        g.drawString(rechthoek,30,300);

        //Rechthoek gevuld
        g.setColor(Color.red);
        g.fillRect(430,80,340,200);
        g.setColor(Color.BLACK);
        g.drawOval(430,80,340,200);
        g.drawString(gevulderechthoekovaal,430,300);

        //Taartpunt
        g.drawOval(830,80,340,200);
        g.drawString(taartpunt,830,300);
        g.setColor(Color.red);
        g.fillArc(830,80,340,200,0,45);

        //Afgeronde Rechthoek
        g.setColor(Color.BLACK);
        g.drawRoundRect(30,310,340,200,30,30);
        g.drawString(ronderechthoek, 30, 530);

        //Ovaal
        g.drawString(ovaal,430,530);
        g.setColor(Color.red);
        g.fillOval(430,310,340,200);

        //Cirkel
        g.setColor(Color.BLACK);
        g.drawOval(900,310,200,200);
        g.drawString(cirkel,830,530);
            }
}
