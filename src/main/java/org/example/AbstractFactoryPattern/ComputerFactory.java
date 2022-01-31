package org.example.AbstractFactoryPattern;

/**
 * Created by will on 7/20/16.
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }

}
