package DecoratorPattern.Coffee;

import DecoratorPattern.Beverage;

/**
 * Created by will on 7/16/16.
 */
public class Espresso extends Beverage {
    @Override
    public double cost() {
        return 1;
    }
}
