package CommandPattern;

/**
 * Created by will on 16-12-20.
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
    }
}
