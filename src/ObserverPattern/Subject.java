package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by will on 7/18/16.
 * 定义了一个Subject对应多个观察者（Observers）的关系。
 * 一旦Subject有了变化，会通知所有的Observers.
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
