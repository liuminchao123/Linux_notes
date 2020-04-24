import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGuilB implements ActionListener {
    // 创建一个按钮对象
    JButton button;

    public static void main(String[] args){
        SimpleGuilB gui = new SimpleGuilB();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        // 定义显示文字
        button = new JButton("click me");

        // 监听动作
        button.addActionListener(this);
        // 将按钮添加到框架中
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        button.setText("I've been clicked!");
    }
}
