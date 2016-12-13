package CompositePattern;

/**
 * Created by will on 16-12-13.
 */
public class TextFile extends File {

    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("This is text file, name：" + super.getName());
    }
}
