import javax.swing.*;
import java.awt.*;

// 创建 JPanel  的子类
public class MyDrawPanel extends JPanel {

    // Graphics 为系统方法 系统调用
    public void paintComponent(Graphics g){
        // 绘图属性
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);

        // 显示 图片
        Image image = new ImageIcon("cat.jpg").getImage();
        g.drawImage(image, 3, 4, this);

        // 以默认颜色填充
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(70, 70, 100, 100);
    }
}
