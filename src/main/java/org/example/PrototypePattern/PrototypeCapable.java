package org.example.PrototypePattern;

/**
 * Created by will on 7/19/16.
 */
public interface PrototypeCapable extends Cloneable {

    public PrototypeCapable clone() throws CloneNotSupportedException;

}
