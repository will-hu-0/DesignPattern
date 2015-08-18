package InterceptingFilterPattern;

/**
 * Created by will on 8/18/15.
 */
public class DebugFilter implements IFilter {
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
