package FactoryPattern;

import java.awt.*;

/**
 * Created by will on 8/19/15.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        IShape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        IShape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        IShape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
