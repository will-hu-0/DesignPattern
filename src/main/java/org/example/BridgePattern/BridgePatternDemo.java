package org.example.BridgePattern;

/**
 * Created by will on 7/24/16.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        // Define the color and pen style
        ImplementorColor color = new GreenImplementor();
        BrushPen pen = new BigBrushPen();

        // Set the color
        pen.setImplementorColor(color);

        // Draw
        pen.draw();
    }
}
