package org.example.InterpreterPattern;

/**
 * Created by will on 16-12-22.
 */
public class MulNode extends SymbolNode {

    public MulNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() * right.interpret();
    }
}
