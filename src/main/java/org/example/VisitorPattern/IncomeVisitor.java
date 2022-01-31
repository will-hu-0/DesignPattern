package org.example.VisitorPattern;

/**
 * Created by will on 5/29/16.
 */
public class IncomeVisitor extends Visitor {

    @Override
    public void Visit(Element element) {
        Employee employee = (Employee)element;

        employee.setIncome(employee.getIncome() * 1.1);
        System.out.println(String.format("%s's new income: %f", employee.getName(), employee.getIncome()));
    }
}
