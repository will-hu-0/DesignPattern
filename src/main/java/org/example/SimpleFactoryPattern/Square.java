package org.example.SimpleFactoryPattern;

/**
 * Created by will on 8/19/15.
 */
public class Square implements IShape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
