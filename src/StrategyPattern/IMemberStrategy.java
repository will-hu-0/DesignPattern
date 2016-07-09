package StrategyPattern;

/**
 * Created by will on 7/9/16.
 */
public interface IMemberStrategy {

    /**
     * Calculate the price of books
     * @param booksPrice
     * @return
     */
    public double calculatePrice(double booksPrice);
}
