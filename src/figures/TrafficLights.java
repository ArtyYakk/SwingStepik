package figures;

import java.awt.*;

public class TrafficLights extends Canvas {

    public void paint(Graphics g) {
         setBackground(Color.WHITE);
         //setForeground(Color.ORANGE);

         //public abstract void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
         //public abstract void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)

        g.setColor(new Color(255,0,1));
        g.fillArc(350,150,100,100,0,360);

        g.setColor(new Color(255,250,0));
        g.fillArc(350,300,100,100,0,360);

        g.setColor(new Color(0,192,53));
        g.fillArc(350,450,100,100,0,360);


    }
}
