package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {

    int number1;
    int number2;

    String nummer;

    public void init() {

        number1 = 999999;
        number2 = 999999;

        nummer = "=";

            }


    public void paint(Graphics g) {

        g.drawString(nummer + number1 * number2,50,50);

    }
}
