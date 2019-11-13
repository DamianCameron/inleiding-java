package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {

    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    Label label2;
    String s, s2, tekst, tekst2;
    int maandnummer;
    int jaar;
    int schrikkel;


    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak2 = new TextField("",20);
        label = new Label("Voer hier de maand nummer in");
        label2 = new Label("voer hier het jaar in");
        tekstvak.addActionListener(new tekstvaklistener());
        tekstvak2.addActionListener(new tekstvaklistener());
        tekst = "";
        add(label);
        add(tekstvak);
        add(label2);
        add(tekstvak2);


    }


    public void paint(Graphics g) {
        g.drawString(tekst,125,80);
    }


    class tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            s2 = tekstvak2.getText();
            maandnummer = Integer.parseInt(s);
            jaar = Integer.parseInt(s2);


            if ( ( jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                    jaar % 400 == 0 ) {
                tekst2 = "" + " is een schrikkeljaar.";
                schrikkel = 29;
            }
            else {
                tekst2 =""+ " is geen schrikkeljaar.";
                schrikkel = 28;
            }

            switch (maandnummer) {
                case 1:
                    tekst = "Januari " + jaar + " heeft 31 dagen en " + tekst2;
                    break;
                case 2:
                    tekst = "Februari " + jaar + " heeft " + schrikkel + " dagen en " + tekst2;
                    break;
                case 3:
                    tekst = "Maart " + jaar + " heeft 31 dagen en " + tekst2;
                    break;
                case 4:
                    tekst = "April " + jaar + " heeft 30 dagen en " + tekst2;
                    break;
                case 5:
                    tekst = "Mei " + jaar + " heeft 31 dagen " + tekst2;
                    break;
                case 6:
                    tekst = "Juni " + jaar + " heeft 30 dagen " + tekst2;
                    break;
                case 7:
                    tekst = "Juli " + jaar + " heeft 31 dagen " + tekst2;
                    break;
                case 8:
                    tekst = "Augustus " + jaar + " heeft 31 dagen " + tekst2;
                    break;
                case 9:
                    tekst = "September " + jaar + " heeft 30 dagen " + tekst2;
                    break;
                case 10:
                    tekst = "Oktober " + jaar + " heeft 31 dagen " + tekst2;
                    break;
                case 11:
                    tekst = "November " + jaar + " heeft 30 dagen " + tekst2;
                    break;
                case 12:
                    tekst = "December " + jaar + " heeft 31 dagen " + tekst2;
                    break;
                default:
                    tekst = "oops, die maand bestaat niet..!";
                    break;
            }
            repaint();
        }
    }
}




