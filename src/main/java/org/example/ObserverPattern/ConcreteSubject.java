package org.example.ObserverPattern;

/**
 * Created by will on 7/18/16.
 */
public class ConcreteSubject extends Subject {

    private String status;

    public String getStatus(){
        return status;
    }

    public void change(String newStatus){
        status = newStatus;
        System.out.println("The subject status changes to : " + status);
        this.notifyObservers();
    }
}
