package CompositePattern;

/**
 * Created by will on 16-12-13.
 */
public class VideoFile extends File{

    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("This is video file, name：" + super.getName());
    }

}
