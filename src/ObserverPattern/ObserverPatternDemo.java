package ObserverPattern;

/**
 * Created by will on 7/18/16.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        subject.attach(observer1);
        subject.attach(observer2);

        subject.change("Start!");
        subject.change("Stop!");

    }
}
