package CompositePattern;

/**
 * Created by will on 16-12-13.
 */
public class ImageFile extends File{

    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("This is image file, name：" + super.getName());
    }

}