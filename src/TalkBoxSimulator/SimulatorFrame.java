package TalkBoxSimulator;
import javax.swing.*;
import java.awt.*;

public class SimulatorFrame extends JFrame{
    public SimulatorFrame() {

        setTitle("TalkBox Configuration App");
        setSize(600, 400);
        setResizable(false);//restricting the user to resize the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        JButton btn1 = new JButton();
        btn1.setText("Happy");
        getContentPane().add(btn1);

        JButton btn2 = new JButton();
        btn2.setText("Sad");
        getContentPane().add(btn2);

        JButton btn3 = new JButton();
        btn3.setText("Excited");
        getContentPane().add(btn3);

        JButton btn4 = new JButton();
        btn4.setText("Tired");
        getContentPane().add(btn4);

        JButton btn5 = new JButton();
        btn5.setText("Proud");
        getContentPane().add(btn5);

        JButton btn6 = new JButton();
        btn6.setText("Sick");
        getContentPane().add(btn6);
    }
}
