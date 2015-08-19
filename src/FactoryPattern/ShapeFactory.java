package FactoryPattern;

/**
 * Created by will on 8/19/15.
 */
public class ShapeFactory {
    public IShape getShape(String shapeType) {
        if (shapeType == null) return null;
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
