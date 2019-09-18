package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {

    //tekstvakken
    TextField links;
    TextField rechts;

    Button keer;
    Button deel;
    Button plus;
    Button min;

    int glinks;
    int grechts;

    int antwoord;

    String text;


    public void init() {

        links = new TextField("",15);
        add(links);

        rechts = new TextField("",15);
        add(rechts);

        keer = new Button();
        keer.setLabel("*");
        keer.addActionListener(new keerListener());
        add(keer);

        deel = new Button();
        deel.setLabel("/");
        deel.addActionListener(new deelListener());
        add(deel);

        plus = new Button();
        plus.setLabel("+");
        plus.addActionListener(new plusListener());
        add(plus);

        min = new Button();
        min.setLabel("-");
        min.addActionListener(new minListener());
        add(min);

        text = "de uitkomst is:";

            }

    public void paint(Graphics g) {

        g.drawString(text + antwoord,50,70);

            }

            class keerListener implements ActionListener{

                public void actionPerformed(ActionEvent e) {
                    String l = links.getText();
                    glinks = Integer.parseInt(l);
                    String r = rechts.getText();
                    grechts = Integer.parseInt(r);
                    antwoord = glinks * grechts;
                    links.setText("");
                    rechts.setText("");
                    repaint();

                }
            }

            class deelListener implements ActionListener{

                public void actionPerformed(ActionEvent e) {
                    String l = links.getText();
                    glinks = Integer.parseInt(l);
                    String r = rechts.getText();
                    grechts = Integer.parseInt(r);
                    antwoord = glinks / grechts;
                    links.setText("");
                    rechts.setText("");
                    repaint();

                }
            }

            class plusListener implements ActionListener{

                public void actionPerformed(ActionEvent e) {
                    String l = links.getText();
                    glinks = Integer.parseInt(l);
                    String r = rechts.getText();
                    grechts = Integer.parseInt(r);
                    antwoord = glinks + grechts;
                    links.setText("");
                    rechts.setText("");
                    repaint();

                }
            }

            class minListener implements ActionListener{

                public void actionPerformed(ActionEvent e) {
                    String l = links.getText();
                    glinks = Integer.parseInt(l);
                    String r = rechts.getText();
                    grechts = Integer.parseInt(r);
                    antwoord = glinks - grechts;
                    links.setText("");
                    rechts.setText("");
                    repaint();

                }
            }
}
