import javax.swing.*;
import java.awt.*;

public class Panel1 {

    public static void main(String [] args){
        Panel1 gui = new Panel1();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        // 让背景变为深灰色
        panel.setBackground(Color.darkGray);
        // 默认布局为 FlowLayout , 改为 BoxLayout
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.setTitle("a panel");
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(200, 200);
        frame.setVisible(true);

        JButton button = new JButton("shock me");
        panel.add(button);

        JButton button2 = new JButton("fuck me");
        panel.add(button2);
    }
}
