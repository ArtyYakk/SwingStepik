package figures;

import java.awt.*;

public class TrafficLights extends Canvas {

    public void paint(Graphics g) {
         setBackground(Color.WHITE);
         //setForeground(Color.ORANGE);

        g.drawString(String.valueOf(115+460-34/2-5),50,50);

        //Прямоугольники
        g.setColor(new Color(50,50,50));
        //g.fillRect(325,120,150,460);
        g.fillRect(321,132,158,438);//Заполнение ширины
        g.fillRect(330,117,140,468);//Заполнение высоты

        //Углы
        g.fillArc(320,115, 34, 34,90,90);//upleft
        g.fillArc(320,553, 34, 34,180,90);//downleft
        g.fillArc(446,115, 34, 34,0,90);//upright
        g.fillArc(446,553, 34, 34,270,90);//downright

        //Ножка
        //g.fillRect(372,607, 60, 80);
        g.fillRect(374,601, 56, 92);
        g.fillRect(367,605, 70, 80);

        g.fillArc(365, 600, 18, 18, 90,90);//upleft
        g.fillArc(365, 600+76, 18, 18, 180,90);//downleft
        g.fillArc(421, 600, 18, 18, 0,90);//upright
        g.fillArc(421, 600+76, 18, 18, 270,90);//downright

        //Круги
        g.setColor(new Color(255,0,1));
        g.fillArc(350,150,100,100,0,360);
        g.setColor(new Color(255,250,0));
        g.fillArc(350,300,100,100,0,360);
        g.setColor(new Color(0,192,53));
        g.fillArc(350,450,100,100,0,360);



    }
}
