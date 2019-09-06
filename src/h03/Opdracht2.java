package h03;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init() {
        setSize(400,400); //canvas size
            }

    public void paint(Graphics g) {

        //huis
        g.drawLine(30,400,30,200); //linker muur
        g.drawLine(30,200,200,200); //plaffond
        g.drawLine(200,200,200,400); //rechter muur
        g.drawLine(30,400,200,400); //vloer

        //dak
        g.drawLine(30,200,115,60); //linkerdak
        g.drawLine(200,200,115,60); //rechterdak

        //deur
        g.drawLine(60,400,60,250); //linker deur
        g.drawLine(120,400,120,250); //rechter deur
        g.drawLine(60,250,120,250); //boventkant deur

        //raam
        g.drawLine(130,250,190,250); //raam onder
        g.drawLine(130,300,190,300); //raam boven
        g.drawLine(130,250,130,300); //raam links
        g.drawLine(190,250,190,300); //raam rechts

            }
}
