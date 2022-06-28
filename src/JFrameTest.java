import javax.swing.*;
import java.awt.*;
import figures.*;

public class JFrameTest {

    public static void createGUI(){
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new TrafficLights());
        frame.setPreferredSize(new Dimension(800, 800));

        frame.pack();
        frame.setVisible(true);
    }

}
