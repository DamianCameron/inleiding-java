package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {

    TextField tekstvak;
    Label label;
    String s, tekst;
    int maandnummer;


    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Voer hier de maand nummer in en druk op enter");
        tekstvak.addActionListener(new tekstvaklistener());
        tekst = "";
        add(label);
        add(tekstvak);

    }


    public void paint(Graphics g) {
        g.drawString(tekst,125,80);
    }


    class tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maandnummer = Integer.parseInt(s);
            switch (maandnummer) {
                case 1:
                    tekst = "Januari heeft 31 dagen.";
                    break;
                case 2:
                    tekst = "Februari heeft 28 of 29 dagen.";
                    break;
                case 3:
                    tekst = "Maart heeft 31 dagen.";
                    break;
                case 4:
                    tekst = "April heeft 30 dagen.";
                    break;
                case 5:
                    tekst = "Mei heeft 31 dagen.";
                    break;
                case 6:
                    tekst = "Juni heeft 30 dagen.";
                    break;
                case 7:
                    tekst = "Juli heeft 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus heeft 31 dagen.";
                    break;
                case 9:
                    tekst = "September heeft 30 dagen.";
                    break;
                case 10:
                    tekst = "Oktober heeft 31 dagen.";
                    break;
                case 11:
                    tekst = "November heeft 30 dagen.";
                    break;
                case 12:
                    tekst = "December heeft 31 dagen.";
                    break;
                default:
                    tekst = "oops, die maand bestaat niet..!";
                    break;
            }
            repaint();
        }
    }
}








