package by.learn.lessons.RobotsAndInheritance;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String title) {
        super(title);
        //setSize(500, 500);
        //setVisible(true);
    }

    public void CreateDrawningZone(Color color, int startX, int startY, int width, int height) {
        setBackground(color);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(startX, startY, width, height);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawLine(20, 10, 100, 60);
    }
}


