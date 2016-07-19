package PrototypePattern;

/**
 * Created by will on 7/19/16.
 */
public class Album implements PrototypeCapable {

    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Album{}";
    }

    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        System.out.println("Cloning album object...");
        return (Album) super.clone();
    }
}
