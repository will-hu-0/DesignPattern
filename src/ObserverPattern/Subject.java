package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by will on 7/18/16.
 */
public abstract class Subject {

    private List<Observer> list = new ArrayList<>();

    public void attach(Observer observer) {
        list.add(observer);
        System.out.println("Attached an observer:" + observer.hashCode());
    }

    public void detach(Observer observer) {
        list.remove(observer);
    }

    /**
     * Update the whole subject object to the observers
     */
    public void notifyObservers() {
        for (Observer observer : list){
            observer.update(this);
        }
    }

    public abstract void change(String status);
}
