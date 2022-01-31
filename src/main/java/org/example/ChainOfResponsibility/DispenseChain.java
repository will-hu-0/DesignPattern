package org.example.ChainOfResponsibility;

/**
 * Created by will on 7/24/16.
 */
public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
