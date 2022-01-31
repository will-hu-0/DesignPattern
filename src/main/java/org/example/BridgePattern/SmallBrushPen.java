package org.example.BridgePattern;

/**
 * Created by will on 7/24/16.
 */
public class SmallBrushPen extends BrushPen {
    @Override
    public void draw() {
        System.out.println("Small and " + implementorColor.bepaint() + " drawing.");
    }
}
