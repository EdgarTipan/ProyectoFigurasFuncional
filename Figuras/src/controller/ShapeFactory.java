package controller;

import model.Circle;
import model.Shape;
import model.Square;
import model.Triangle;

/**
 * @author Edgar Tipan
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        return switch (shapeType.toLowerCase()) {
            case "square" -> new Square();
            case "circle" -> new Circle();
            case "triangle" -> new Triangle();
            default -> null;
        };
    }
}