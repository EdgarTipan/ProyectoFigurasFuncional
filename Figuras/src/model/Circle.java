package model;

import java.awt.*;

/**
 * @author Edgar Tipan
 */
public class Circle implements Shape {

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(100, 150, 200, 200);
    }
}