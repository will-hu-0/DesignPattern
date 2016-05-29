package VisitorPattern;

/**
 * Created by will on 5/29/16.
 */
public class VacationVisitor extends Visitor {

    @Override
    public void Visit(Element element) {
        Employee employee = (Employee)element;

        employee.setVacationDays(employee.getVacationDays() + 3);
        System.out.println(String.format("%s's new vacation days: %d", employee.getName(), employee.getVacationDays()));
    }
}
