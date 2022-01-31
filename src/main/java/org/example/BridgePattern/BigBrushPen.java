package org.example.BridgePattern;

/**
 * Created by will on 7/24/16.
 */
public class BigBrushPen extends BrushPen {

    @Override
    public void draw() {
        System.out.println("Big and " + implementorColor.bepaint() + " drawing.");
    }
}
