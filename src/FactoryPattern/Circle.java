package FactoryPattern;

/**
 * Created by will on 8/19/15.
 */
public class Circle implements IShape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}