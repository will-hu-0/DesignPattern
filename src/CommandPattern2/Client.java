package CommandPattern2;

/**
 * Created by will on 17-1-7.
 * https://dzone.com/articles/design-patterns-command
 * Check the class diagram and sequence diagram.
 */
public class Client {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);

        //swith on
        control.setCommand(lightsOn);
        control.pressButton();

        //switch off
        control.setCommand(lightsOff);
        control.pressButton();
    }
}
