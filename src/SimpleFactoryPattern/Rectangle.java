package SimpleFactoryPattern;

/**
 * Created by will on 8/19/15.
 */
public class Rectangle implements IShape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}