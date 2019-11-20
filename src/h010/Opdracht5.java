package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {

    TextField tekstvak;
    Label label;
    Button button;
    String s, tekst;
    int inputcijfer;
    int buffer;
    int totaal;


    public void init() {
    tekstvak = new TextField("", 20);
    label = new Label("voer hier je cijfers in");
    button = new Button("OK");
    button.addActionListener(new buttonlistener());
    tekstvak.addActionListener(new buttonlistener());
    tekst ="";
    add(label);
    add(tekstvak);
    add(button);

    }


    public void paint(Graphics g) {
        g.drawString(tekst + inputcijfer,50,70);
    }

    class buttonlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            inputcijfer = Integer.parseInt(s);

            inputcijfer = inputcijfer + inputcijfer;

            repaint();
        }
    }
}
