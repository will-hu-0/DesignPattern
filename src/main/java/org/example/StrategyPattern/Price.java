package org.example.StrategyPattern;

/**
 * Created by will on 7/9/16.
 */
public class Price {

    private IMemberStrategy strategy;

    public Price(IMemberStrategy strategy) {
        this.strategy = strategy;
    }

    public double quote(double booksPrice) {
        return strategy.calculatePrice(booksPrice);
    }

}
