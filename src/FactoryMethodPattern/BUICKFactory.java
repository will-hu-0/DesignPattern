package FactoryMethodPattern;

/**
 * Created by will on 8/19/15.
 */
public class BUICKFactory implements ICarFactory {
    public ICar createCar() {
        return new BUICK();
    }
}
