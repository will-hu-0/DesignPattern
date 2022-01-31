package org.example.VisitorPattern;

/**
 * Created by will on 5/29/16.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        // Setup employee collection
        Employees employees = new Employees();

        employees.Attach(new Employee("Will", 25000, 10));
        employees.Attach(new Employee("Jason", 26000, 14));
        employees.Attach(new Employee("Tom", 27900, 8));

        IncomeVisitor incomeVisitor = new IncomeVisitor();
        VacationVisitor vacationVisitor = new VacationVisitor();

        employees.Accept(incomeVisitor);
        employees.Accept(vacationVisitor);

    }
}
