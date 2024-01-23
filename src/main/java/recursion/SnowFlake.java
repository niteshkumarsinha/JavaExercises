package recursion;

import javax.swing.*;
import java.awt.*;

public class SnowFlake extends Canvas{

    public void paint(Graphics graphics){
        drawSnowflake(graphics, 0, 0, 100, 100);
    }

    public static void drawSnowflake(final Graphics graphics,
                                     final int startX, final int startY,
                                     final int length, final int depth) {
        for (int degree = 0; degree < 360; degree += 60) {
            final double rad = degree * Math.PI / 180;
            final int endX = (int) (startX + Math.cos(rad) * length);
            final int endY = (int) (startY + Math.sin(rad) * length);
            graphics.drawLine(startX, startY, endX, endY);
            if (depth > 0) {
                drawSnowflake(graphics, endX, endY, length / 4, depth - 1);
            }
        }
    }

    public static void main(String[] args) {
        SnowFlake snowFlake = new SnowFlake();
        JFrame f=new JFrame();
        f.add(snowFlake);
        f.setSize(400,400);
        f.setVisible(true);

    }
}
