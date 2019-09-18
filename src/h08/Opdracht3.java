package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {

    Button ok;
    TextField tekstvak;
    Label label;

    int getal;

    String text;

    public void init() {

        ok = new Button();
        ok.setLabel("OK");
        ok.addActionListener(new okListener());
        add(ok);

        tekstvak = new TextField("",20);
        label = new Label("type iets");
        add(tekstvak);
        add(label);

        text = "de uitkomst =";

            }

    public void paint(Graphics g) {

        g.drawString(text + " " + (getal / 100 * 121),50,70);

            }

            class okListener implements ActionListener{

                public void actionPerformed(ActionEvent e) {
                    String s = tekstvak.getText();
                    getal = Integer.parseInt(s);
                    repaint();

                }
            }
}
