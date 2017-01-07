package CommandPattern2;

/**
 * Created by will on 17-1-7.
 * Light is our receiver class
 */
public class Light {
    private boolean on;

    public void switchOn() {
        on = true;
        System.out.println("Light is on");
    }

    public void switchOff() {
        on = false;
        System.out.println("Light is off");
    }
}
