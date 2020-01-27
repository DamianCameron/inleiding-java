package h011;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {

    TextField tekstvak;
    Button knop;
    double getal;

    public void init() {

        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);
        knop = new Button();
        knop.addActionListener(new KnopListener());
        knop.setLabel("klik hier!");
        add(knop);
            }

    public void paint(Graphics g) {

        int teller = 0;
        int x = 50;
        int y = 70;

        int a = 1;

        while (teller < 10) {
            g.drawString(a + "x" + getal + "=" + (a * getal) + "", x, y);
            teller++;
            y += 20;
            a += 1;
        }
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }
}
