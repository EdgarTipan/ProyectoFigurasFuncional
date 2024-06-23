package view;

import controller.ShapeDrawer;

import javax.swing.*;
import java.awt.*;

/**
 * @author Edgar Tipan
 */
public class DrawingPanel extends JPanel {
    private final ShapeDrawer shapeDrawer;

    public DrawingPanel(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        shapeDrawer.draw(g);
    }
}
