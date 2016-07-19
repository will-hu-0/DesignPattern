package PrototypePattern;

/**
 * Created by will on 7/19/16.
 */
public class Movie implements PrototypeCapable {

    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{}";
    }

    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        System.out.println("Cloning movie object...");
        return (Movie) super.clone();
    }
}
