package StrategyPattern;

/**
 * Created by will on 7/9/16.
 */
public class IntermediateIMemberStrategy implements IMemberStrategy {
    @Override
    public double calculatePrice(double booksPrice) {
        System.out.println("Discount for intermediate members is 10%");
        return booksPrice * 0.9;
    }
}
