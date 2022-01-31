package org.example.ServiceLocatorPattern;

/**
 * Created by will on 8/18/15.
 */
public class Service2 implements IService {
    public void execute() {
        System.out.println("Execute Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}
