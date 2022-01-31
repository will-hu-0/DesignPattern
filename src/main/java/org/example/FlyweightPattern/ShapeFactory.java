package org.example.FlyweightPattern;

import java.util.HashMap;

/**
 * Created by will on 16-12-12.
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color (Heavy load action) : " + color);
        }
        return circle;
    }
}
