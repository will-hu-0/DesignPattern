package InterceptingFilterPattern;

/**
 * Created by will on 8/18/15.
 */
public class Target {
    public void execute2(String request){
        System.out.println("Executing request: " + request);
    }
}
