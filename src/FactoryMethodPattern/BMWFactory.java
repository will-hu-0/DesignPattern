package FactoryMethodPattern;

/**
 * Created by will on 8/19/15.
 */
public class BMWFactory implements ICarFactory {
    public ICar createCar() {
        return new BMW();
    }
}
