package org.example.ChainOfResponsibility;

import java.util.Scanner;

/**
 * Created by will on 7/24/16.
 */
public class ChainOfResponsibilityDemo {

    private DispenseChain chain1;

    public ChainOfResponsibilityDemo() {
        // initialize the chain
        this.chain1 = new Dollar50Dispenser();
        DispenseChain chain2 = new Dollar20Dispenser();
        DispenseChain chain3 = new Dollar10Dispenser();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
    }

    public static void main(String[] args) {
        ChainOfResponsibilityDemo atmDispenser = new ChainOfResponsibilityDemo();
        while(true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");

            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if (amount%10 != 0) {
                System.out.printf("Amount should be in multiple of 10s.");
                return;
            }
            // Process the request
            atmDispenser.chain1.dispense(new Currency(amount));
        }

    }

}
