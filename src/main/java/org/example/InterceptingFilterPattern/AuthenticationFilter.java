package org.example.InterceptingFilterPattern;

import java.nio.file.attribute.FileAttribute;

/**
 * Created by will on 8/18/15.
 */
public class AuthenticationFilter implements IFilter {
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
