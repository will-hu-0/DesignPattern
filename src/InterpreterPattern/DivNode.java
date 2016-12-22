package InterpreterPattern;

/**
 * Created by will on 16-12-22.
 */
public class DivNode extends SymbolNode {

    public DivNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() / right.interpret();
    }
}
