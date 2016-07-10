package VisitorPattern2;

/**
 * Created by will on 7/10/16.
 */
public abstract class Department {

    public abstract void visit(ManagerEmployee managerEmployee);

    public abstract void visit(GeneralEmployee generalEmployee);
}
