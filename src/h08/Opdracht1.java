package h08;

import javax.xml.bind.Marshaller;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class Opdracht1 extends Applet {

    Button knop;
    Button knop2;

    TextField tekstvak;

    Label label;

    String bericht;

    public void init() {

        setSize(400,400);

        knop = new Button();
        knop.addActionListener(new knopListener());
        knop.setLabel("Enter");
        add(knop);

        knop2 = new Button();
        knop2.addActionListener(new knop2Listener());
        knop2.setLabel("Reset");
        add(knop2);

        tekstvak = new TextField("Type something",20);
        label = new Label("");
        add(label);
        add(tekstvak);

        bericht = "er staat nog niks...";

            }


    public void paint(Graphics g) {

        g.drawString(bericht,30,150);

    }

        class knopListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                bericht = tekstvak.getText();
                repaint();
            }
        }

        class knop2Listener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                tekstvak.setText("Type something");

            }
        }




}
