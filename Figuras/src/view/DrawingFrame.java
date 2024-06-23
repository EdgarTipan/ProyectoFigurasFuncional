package view;

import controller.ShapeDrawer;
import controller.ShapeFactory;
import model.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.function.Supplier;

/**
 * @author Edgar Tipan
 */
public class DrawingFrame {

    public void AppFiguras(String title) {
        //Marco principal
        JFrame frame = new JFrame();
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        ShapeDrawer shapeDrawer = new ShapeDrawer();
        DrawingPanel drawingPanel = new DrawingPanel(shapeDrawer);

        //Panel de botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1));

        //Fabrica de figuras
        ShapeFactory shapeFactory = new ShapeFactory();

        //Crear botones y añadirlos al panel
        buttonPanel.add(createButton("Triángulo",
                () -> shapeFactory.getShape("triangle"), shapeDrawer, drawingPanel));
        buttonPanel.add(createButton("Cuadrado",
                () -> shapeFactory.getShape("square"), shapeDrawer, drawingPanel));
        buttonPanel.add(createButton("Círculo",
                () -> shapeFactory.getShape("circle"), shapeDrawer, drawingPanel));


        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, drawingPanel, buttonPanel);
        splitPane.setDividerLocation(400);

        frame.add(splitPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    // Funcion para crear botones
    private JButton createButton(String text, Supplier<Shape> shapeSupplier, ShapeDrawer shapeDrawer, DrawingPanel drawingPanel) {
        JButton button = new JButton(text);
        button.addActionListener(e -> {
            shapeDrawer.setShape(shapeSupplier.get());
            drawingPanel.repaint();
        });
        return button;
    }
}
