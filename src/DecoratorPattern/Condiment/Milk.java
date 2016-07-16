package DecoratorPattern.Condiment;

import DecoratorPattern.Beverage;
import DecoratorPattern.CondimentDecorator;

/**
 * Created by will on 7/16/16.
 */
public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }
}
