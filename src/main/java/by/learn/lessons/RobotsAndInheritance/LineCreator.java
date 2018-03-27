package by.learn.lessons.RobotsAndInheritance;

import java.awt.*;

/**
 * Created by user on 26.03.2018.
 */
public class LineCreator {
    private static int startX = 700;
    private static int startY = 300;

    public static void main(String[] args) {
        MyFrame xxx = new MyFrame("Рисовалка");
        xxx.CreateDrawningZone(Color.green, startX, startY, 400, 300);
    }
}
