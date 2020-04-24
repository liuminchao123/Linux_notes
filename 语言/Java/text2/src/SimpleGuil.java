// 创建一个可视化框架
import javax.swing.*;

public class SimpleGuil {
    public static void main(String[] args){

        // 创建一个框架
        JFrame frame = new JFrame();
        // 创建 button
        JButton button = new JButton();

        // 当窗口关闭时，将程序结束掉
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 将按钮加到 框架上
        frame.getContentPane().add(button);
        // 设定框架的大小
        frame.setSize(300, 300);
        // 将 框架显示出来
        frame.setVisible(true);
    }
}
