package org.example.CommandPattern2;

/**
 * Created by will on 17-1-7.
 * Our invoker in this case is the remote control.
 * The invoker should be decoupled from the object handling the invocation.
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
