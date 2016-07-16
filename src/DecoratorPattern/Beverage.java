package DecoratorPattern;

/**
 * Created by will on 7/16/16.
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
