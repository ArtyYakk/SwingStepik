import javax.swing.*;
import java.awt.*;
import figures.*;

public class JFrameTest extends Canvas {

    public static void createGUI(){
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // frame.add(new JFrameTest());
        frame.add(new RedCircle());
        frame.setPreferredSize(new Dimension(400, 400));

        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {

        setBackground(Color.BLACK);
        g.fillRect(130, 30,100, 80);
        g.drawOval(30,130,50, 60);
        setForeground(Color.RED);
        g.fillOval(130,130,50, 60);
        g.drawArc(30, 200, 40,50,90,60);
        g.fillArc(30, 130, 40,50,180,40);

    }

}
