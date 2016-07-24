package ChainOfResponsibility;

/**
 * Created by will on 7/24/16.
 */
public class Dollar10Dispenser  implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmout() >= 10) {
            int num = cur.getAmout() / 10;
            int remainder = cur.getAmout() % 10;
            System.out.println("Dispensing " + num + " 10$ note");
            if (remainder !=0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(cur);
        }
    }
}