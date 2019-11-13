package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {

    TextField tekstvak;
    Button ok;

    int getal;
    int getal2;
    int getal3;

    public void init() {

        tekstvak = new TextField("",20);
        add(tekstvak);

        ok = new Button();
        ok.setLabel("OK");
        ok.addActionListener(new oklistener());
        add(ok);

        getal2 = 0;

        getal3 = 0;


            }

    public void paint(Graphics g) {

        g.drawString("" + getal2,50,70);
        g.drawString("" + getal3,50,90);

            }

            class oklistener implements ActionListener{

                public void actionPerformed(ActionEvent e) {
                    String s = tekstvak.getText();
                    getal = Integer.parseInt(s);
                    if (getal > getal2) {
                        getal2 = getal;
                        repaint();
                    }
                    if (getal < getal2) {
                        getal3 = getal;
                        repaint();
                    }

                }
            }
}
