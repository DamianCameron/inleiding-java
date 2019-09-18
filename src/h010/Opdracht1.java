package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {

    TextField tekstvak;
    Button ok;

    int getal;
    int getal2;

    public void init() {

        tekstvak = new TextField("",20);
        add(tekstvak);

        ok = new Button();
        ok.setLabel("OK");
        ok.addActionListener(new oklistener());
        add(ok);

        getal2 = 0;


            }

    public void paint(Graphics g) {

        g.drawString("" + getal,50,70);

            }

            class oklistener implements ActionListener{

                public void actionPerformed(ActionEvent e) {
                    String s = tekstvak.getText();
                    getal = Integer.parseInt(s);
                    if (getal > getal2) {
                        getGraphics().drawString(""+ getal,50,90);
                        getal2 = getal;
                        repaint();
                    }

                }
            }
}
