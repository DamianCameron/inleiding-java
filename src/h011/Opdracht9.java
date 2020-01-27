package h011;

import com.sun.deploy.security.SelectableSecurityManager;

import java.applet.Applet;
import java.awt.*;

public class Opdracht9 extends Applet {

    public void init() {

        setSize(300,300);

            }

    public void paint(Graphics g) {

        int teller = 0;
        int x = 50;
        int y = 50;
        int breedte = 25;
        int hoogte = 25;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
                g.fillRect(x, y + 50, breedte, hoogte);
                g.fillRect(x, y + 100,breedte,hoogte);
                g.fillRect(x, y + 150,breedte,hoogte);
            }

            else {
                g.setColor(Color.white);
                g.fillRect(x,y,breedte,hoogte);
            }

            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }

            else {
                g.setColor(Color.black);
                g.fillRect(x,y,breedte,hoogte);
                g.fillRect(x,y + 50,breedte,hoogte);
                g.fillRect(x,y + 100,breedte,hoogte);
                g.fillRect(x,y + 150,breedte,hoogte);
            }

            x += breedte;
        }
    }
}
