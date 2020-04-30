
import javax.swing.*;
import java.awt.*;


public class SimpleAnimation {

    int x = 70;
    int y = 70;

    public static void main (String[] args) {
        SimpleAnimation gui = new SimpleAnimation ();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);

        // 通过循环改变 圆环的位置
        for (int i = 0; i < 130; i++) {
            x++;
            y++;
            drawPanel.repaint();  //  重新绘制

            try {
                // 加上延迟
                Thread.sleep(50);
            } catch(Exception ex) { }
        }

    }// close go() method

    class MyDrawPanel extends JPanel {

        public void paintComponent(Graphics g) {
            // 将轨迹覆盖
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(), this.getHeight());

            g.setColor(Color.green);
            g.fillOval(x,y,40,40);
        }
    } // close inner class
} // close outer class