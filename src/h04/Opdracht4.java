package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    String blauw;
    String rood;
    String geel;

    public void init() {
        setSize(400,400);
        setBackground(Color.pink);

        blauw = "Jeroen";
        rood = "Hans";
        geel = "Valerie";

            }

    public void paint(Graphics g) {

        //statistieken
        g.setColor(Color.GRAY);
        g.fillRect(0,360,400,40);//UI

        g.setColor(Color.BLUE);
        g.fillRect(50,160,50,200);//Jeroen

        g.setColor(Color.red);
        g.fillRect(150,200,50,160);//Hans

        g.setColor(Color.YELLOW);
        g.fillRect(250,280,50,80);//Valerie

        //Namen
        g.setColor(Color.green);
        g.drawString(blauw,50,380);
        g.drawString(rood,150,380);
        g.drawString(geel,250,380);
            }
}
