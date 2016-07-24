package BridgePattern;

/**
 * Created by will on 7/24/16.
 */
public abstract class BrushPen {

    protected ImplementorColor implementorColor;

    public abstract void draw();

    public void setImplementorColor(ImplementorColor implementorColor){
        this.implementorColor = implementorColor;
    }

}
