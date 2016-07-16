package DecoratorPattern;

import DecoratorPattern.Coffee.DarkRoast;
import DecoratorPattern.Coffee.Espresso;
import DecoratorPattern.Condiment.Mocha;
import DecoratorPattern.Condiment.Whip;

/**
 * Created by will on 7/16/16.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}