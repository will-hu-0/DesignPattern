package ProxyPattern;

/**
 * Created by will on 16-12-19.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        image.display();
        System.out.println("");
        image.display();
    }
}
