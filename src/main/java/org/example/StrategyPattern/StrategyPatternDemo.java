package org.example.StrategyPattern;

/**
 * Created by will on 7/9/16.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        IMemberStrategy strategy = new PrimaryIMemberStrategy();
        Price price = new Price(strategy);
        double quote = price.quote(100);
        System.out.println("The price is : "+ quote);
    }
}
