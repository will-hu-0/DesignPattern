package AbstractFactoryPattern;

/**
 * Created by will on 7/20/16.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        Computer laptop = ComputerFactory.getComputer(new LaptopFactory("2G", "500G", "2.4GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16G", "2T", "3.6GHz"));

        System.out.println("AbstractFactory laptop Config::" + laptop);
        System.out.println("AbstractFactory server Config::" + server);

    }
}
