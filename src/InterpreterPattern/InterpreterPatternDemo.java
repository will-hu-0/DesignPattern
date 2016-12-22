package InterpreterPattern;

/**
 * Created by will on 16-12-22.
 * http://www.cnblogs.com/chenssy/p/3346427.html
 */
public class InterpreterPatternDemo {
    public static void main(String args[]){

        String statement = "3 * 2 * 4 / 6 % 5";

        Calculator calculator = new Calculator();

        calculator.build(statement);

        int result = calculator.compute();

        System.out.println(statement + " = " + result);
    }
}
