package model;

import java.awt.*;

/**
 * @author Edgar Tipan
 */
public class Square implements Shape {

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(100, 150, 200, 200);
    }
}