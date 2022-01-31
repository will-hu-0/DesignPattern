package org.example.ServiceLocatorPattern;

/**
 * Created by will on 8/18/15.
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        IService service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
