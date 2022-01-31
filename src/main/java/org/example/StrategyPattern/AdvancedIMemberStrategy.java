package org.example.StrategyPattern;

/**
 * Created by will on 7/9/16.
 */
public class AdvancedIMemberStrategy implements IMemberStrategy {
    @Override
    public double calculatePrice(double booksPrice) {
        System.out.println("Discount for intermediate members is 20%");
        return booksPrice * 0.8;
    }
}
