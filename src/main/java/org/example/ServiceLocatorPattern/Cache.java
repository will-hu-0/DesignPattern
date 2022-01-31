package org.example.ServiceLocatorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by will on 8/18/15.
 */
public class Cache {

    private List<IService> services;

    public Cache() {
        services = new ArrayList<IService>();
    }

    public IService getService(String serviceName) {
        for (IService service : services) {
            if (service.getName().equalsIgnoreCase(serviceName)) {
                System.out.println(String.format("Returning cached %s object", serviceName));
                return service;
            }
        }
        return null;
    }

    public void addService (IService newService) {
        boolean exists = false;
        for (IService service : services) {
            if (service.getName().equalsIgnoreCase(newService.getName())) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            services.add(newService);
        }
    }

}
