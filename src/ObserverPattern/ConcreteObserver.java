package ObserverPattern;

/**
 * Created by will on 7/18/16.
 */
public class ConcreteObserver implements Observer {

    private String observerState;

    @Override
    public void update(Subject subject) {
        //We can only get only a few information from subject object.
        observerState = ((ConcreteSubject)subject).getStatus();
        System.out.println("  Then the observer status changes to :" + observerState);
    }
}
