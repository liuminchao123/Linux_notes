import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea1 implements ActionListener {

    JTextArea text;
    public static void main(String [] args){
        TextArea1 gui = new TextArea1();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Just Click It");
        // 增加监听
        button.addActionListener(this);
        // 创建显示文本的多行区域，   设置大小
        text = new JTextArea(10, 20);

        // 设置文本区域的换行策略。如果设置为true，则如果线条太长而无法容纳在分配的宽度内，则会对其进行换行。
        // 如果设置为false，则这些行将始终被展开。
        // 一个PropertyChange 当政策发生变化事件（“lineWrap”）被触发。
        // 默认情况下，此属性为false。
        text.setLineWrap(true);

        // 创建一个滚动视图
        JScrollPane scroller = new JScrollPane(text);
        // 确定竖直和水平滚动条何时出现在滚动窗格中  选定值为 AS_NEEDED ALWAYS NEVER
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        // vertical 竖直的   horizontal   水平的    scroll  卷    bar  条

        panel.add(scroller);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        frame.setSize(350, 300);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent ev){
        text.append("button clicked \n");
    }
}
