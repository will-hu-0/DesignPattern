package StrategyPattern;

/**
 * Created by will on 7/9/16.
 */
public class PrimaryIMemberStrategy implements IMemberStrategy {
    @Override
    public double calculatePrice(double booksPrice) {
        System.out.println("No discount for primary members");
        return booksPrice;
    }
}
