package controller;

import model.Shape;

import java.awt.*;

/**
 * @author Edgar Tipan
 */
public class ShapeDrawer {

    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void draw(Graphics g) {
        if (shape != null) {
            shape.draw(g);
        }
    }
}
