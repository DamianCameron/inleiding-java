package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    public void init() {
        setSize(400,400);
        setBackground(Color.pink);
            }

    public void paint(Graphics g) {


        //vlag
        g.setColor(Color.red);
        g.fillRect(60,50,200,70); //rood

        g.setColor(Color.WHITE);
        g.fillRect(60,120,200,70); //wit

        g.setColor(Color.BLUE);
        g.fillRect(60,190,200,70); //blauw

        g.setColor(Color.GRAY);
        g.fillRect(30,50,30,350); //paal
            }
}
