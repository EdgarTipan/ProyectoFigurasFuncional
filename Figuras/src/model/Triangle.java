package model;

import java.awt.*;

/**
 * @author Edgar Tipan
 */
public class Triangle implements Shape {

    @Override
    public void draw(Graphics g) {
        int[] xPoints = {100, 200, 300};
        int[] yPoints = {350, 150, 350};
        g.setColor(Color.RED);
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
