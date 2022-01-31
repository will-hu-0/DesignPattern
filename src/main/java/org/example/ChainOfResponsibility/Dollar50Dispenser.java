package org.example.ChainOfResponsibility;

/**
 * Created by will on 7/24/16.
 */
public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain chain;


    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmout() >= 50) {
            int num = cur.getAmout() / 50;
            int remainder = cur.getAmout() % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if (remainder !=0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(cur);
        }
    }
}
