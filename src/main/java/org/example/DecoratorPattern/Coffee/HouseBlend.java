package org.example.DecoratorPattern.Coffee;


import org.example.DecoratorPattern.Beverage;

/**
 * Created by will on 7/16/16.
 */
public class HouseBlend extends Beverage {

    @Override
    public double cost() {
        return 0.89;
    }
}
