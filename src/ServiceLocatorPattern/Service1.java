package ServiceLocatorPattern;

/**
 * Created by will on 8/18/15.
 */
public class Service1 implements IService {
    public void execute() {
        System.out.println("Execute Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}
