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
    int getal3;
    int getal4;

    public void init() {

        tekstvak = new TextField("",20);
        add(tekstvak);

        ok = new Button();
        ok.setLabel("OK");
        ok.addActionListener(new oklistener());
        add(ok);

        getal2 = 0;
        getal3 = 0;
        getal4 = 0;


            }

    public void paint(Graphics g) {

        g.drawString("Hoogste Getal:" + getal4,50,70);
        g.drawString("Laagste Getal:"+ getal3, 50,90);

            }

            class oklistener implements ActionListener{

                public void actionPerformed(ActionEvent e) {
                    String s = tekstvak.getText();
                    getal = Integer.parseInt(s);
                    if (getal > getal2) {
                        getGraphics().drawString(""+ getal,50,70);
                        getal2 = getal;
                        getal4 = getal2;
                                         }
                    // Applet werkt, alleen blijft het laagste getal hoger worden
                    // waneer je een cijfer invoerd tussen het hoogste en het laagste
                    // getal.
                    if (getal < getal4) {
                        getGraphics().drawString(""+ getal, 50, 90);
                        getal3 = getal;
                                        }

                    repaint();

                }
            }
}
