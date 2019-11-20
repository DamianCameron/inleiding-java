package h010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {

    TextField tekstvak;
    Label label;
    Button button;
    String s, tekst;
    int cijfer;

    public void init() {

        tekstvak = new TextField(20);
        label = new Label("voer hier je cijfer in");
        button = new Button("Bereken");
        button.addActionListener(new buttonlistener());
        add(tekstvak);
        add(label);
        add(button);
        tekst = "";
    }


    public void paint(Graphics g) { g.drawString(tekst = "",50,70); }


    class buttonlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);


            switch (cijfer) {

                        case 1:
                        case 3:
                        case 2:
                            tekst = "je hebt een slecht cijfer... :(";
                            break;
                        case 4:
                            tekst = "je hebt een onvoldoende cijfer... :(";
                            break;
                        case 5:
                            tekst = "je hebt een matig cijfer... :|";
                            break;
                        case 6:
                        case 7:
                            tekst = "je hebt een voldoende cijfer... :)";
                            break;
                        case 8:
                        case 9:
                            tekst = "je hebt een goed cijfer!... :)";
                            break;
                        case 10:
                            tekst = "je hebt een tien! gefeliciteerd!... :)";
                            break;
                        default:
                            tekst = "dat is een verkeerd cijfer... :(";
                            break;
                    }
                    repaint();
                }
            }
}

