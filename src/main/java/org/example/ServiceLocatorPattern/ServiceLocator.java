package org.example.ServiceLocatorPattern;

/**
 * Created by will on 8/18/15.
 */
public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static IService getService(String jndiName) {
        IService service = cache.getService(jndiName);
        if (service!=null) return service;

        InitialContext context = new InitialContext();
        IService service0 = (IService)context.lookup(jndiName);
        cache.addService(service0);
        return service0;
    }
}
