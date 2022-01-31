package org.example.DecoratorPattern.Condiment;

import org.example.DecoratorPattern.Beverage;
import org.example.DecoratorPattern.CondimentDecorator;

/**
 * Created by will on 7/16/16.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
