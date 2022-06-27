package figures;

import java.awt.*;

public class RedCircle extends Canvas {

    public void paint(Graphics g) {
         setBackground(Color.WHITE);
         setForeground(Color.ORANGE);

         //public abstract void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
         //public abstract void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)

       //g.drawArc(200,200,50,50,0,360);
        g.fillArc(200,200,50,50,0,360);

       // setBackground(Color.WHITE);
       // setForeground(Color.RED);
        g.setColor(Color.BLACK);
        g.fillArc(250,250,50,50,0,360);

        g.drawString("Привет ДАНЯ",250,200);


    }
}
