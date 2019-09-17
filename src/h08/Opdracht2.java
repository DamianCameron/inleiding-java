package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {

    Button man;
    Button vrouw;
    Button jongen;
    Button meisje;

    String intro;

    String textman;
    String textvrouw;
    String textjongen;
    String textmeisje;

    String totaal;

    double stem;
    double stem2;
    double stem3;
    double stem4;

    public void init() {

        //knoppen
        man = new Button();
        man.setLabel("Man");
        man.addActionListener(new manListener());
        add(man);

        vrouw = new Button();
        vrouw.setLabel("Vrouw");
        vrouw.addActionListener(new vrouwListener());
        add(vrouw);

        jongen = new Button();
        jongen.setLabel("Jongen");
        jongen.addActionListener(new jongenListener());
        add(jongen);

        meisje = new Button();
        meisje.setLabel("Meisje");
        meisje.addActionListener(new meisjeListener());
        add(meisje);


        //text
        intro = "Goeienavond, geef hier u geslacht aan.";

        textman = "Aantal Mannen:";
        textvrouw = "Aantal Vrouwen:";
        textjongen = "Aantal Jongens:";
        textmeisje = "Aantal Meisjes:";

        totaal = "Het totale aantal mensen vanavond:";

        stem = 0;

    }

    public void paint(Graphics g) {

        g.drawString(intro, 50, 70);
        g.drawString(textman + " " + stem, 50, 90);
        g.drawString(textvrouw + " " + stem2, 50, 110);
        g.drawString(textjongen + " " + stem3, 50, 130);
        g.drawString(textmeisje + " " + stem4, 50, 150);
        g.drawString(totaal + " " + (stem + stem2 + stem3 + stem4),50,170);

    }

    class manListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            stem++;
            repaint();

        }
    }

    class vrouwListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            stem2++;
            repaint();

        }
    }

    class jongenListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            stem3++;
            repaint();

        }
    }

    class meisjeListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            stem4++;
            repaint();

        }
    }

}
