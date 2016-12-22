package InterpreterPattern;

/**
 * Created by will on 16-12-22.
 * 非终结表达式：ValueNode.java。主要用解释该表达式的值。
 */
public class ValueNode implements Node {

    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
