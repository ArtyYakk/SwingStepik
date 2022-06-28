package figures;

import java.awt.*;

public class TrafficLights extends Canvas {

    public void paint(Graphics g) {
         setBackground(Color.WHITE);
         //setForeground(Color.ORANGE);

        g.drawString(String.valueOf(115+460-34/2-5),50,50);

        g.setColor(new Color(50,50,50));
        g.fillRect(325,120,150,460);

        g.fillArc(320,115, 34, 34,90,90);//upleft
        g.fillArc(320,553, 34, 34,180,90);//downleft

        g.fillArc(446,115, 34, 34,0,90);//upright
        g.fillArc(446,553, 34, 34,270,90);//downright

        g.setColor(new Color(255,0,1));
        g.fillArc(350,150,100,100,0,360);

        g.setColor(new Color(255,250,0));
        g.fillArc(350,300,100,100,0,360);

        g.setColor(new Color(0,192,53));
        g.fillArc(350,450,100,100,0,360);

    }
}
