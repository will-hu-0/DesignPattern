package DecoratorPattern.Coffee;

import DecoratorPattern.Beverage;

/**
 * Created by will on 7/16/16.
 */
public class DarkRoast extends Beverage {

    @Override
    public double cost() {
        return 1.05;
    }
}
