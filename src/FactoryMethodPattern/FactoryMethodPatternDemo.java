package FactoryMethodPattern;

/**
 * Created by will on 8/19/15.
 */
public class FactoryMethodPatternDemo {
    public static void main(String []args) {
        ICarFactory factory1 = new BMWFactory();
        ICar car1 = factory1.createCar();
        car1.Paint();

        ICarFactory factory2 = new BUICKFactory();
        ICar car2 = factory2.createCar();
        car2.Paint();
    }
}
