package org.example.VisitorPattern;

/**
 * Created by will on 5/29/16.
 */
abstract public class Element {

    abstract public void Accept(Visitor visitor);

}
