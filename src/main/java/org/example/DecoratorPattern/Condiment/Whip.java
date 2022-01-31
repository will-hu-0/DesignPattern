package org.example.DecoratorPattern.Condiment;

import org.example.DecoratorPattern.Beverage;
import org.example.DecoratorPattern.CondimentDecorator;

/**
 * Created by will on 7/16/16.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }
}
