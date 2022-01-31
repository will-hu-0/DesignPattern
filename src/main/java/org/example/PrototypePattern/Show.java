package org.example.PrototypePattern;

/**
 * Created by will on 7/19/16.
 */
public class Show implements PrototypeCapable {

    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Show{}";
    }

    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        System.out.println("Cloning show object...");
        return (Show) super.clone();
    }
}
