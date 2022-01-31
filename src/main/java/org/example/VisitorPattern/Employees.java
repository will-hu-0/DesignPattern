package org.example.VisitorPattern;

import java.util.ArrayList;

/**
 * Created by will on 5/29/16.
 */
public class Employees {

    private ArrayList<Employee> employees = new ArrayList<>();

    void Attach(Employee employee) {
        employees.add(employee);
    }

    void Detach(Employee employee) {
        employees.remove(employee);
    }

    void Accept(Visitor visitor) {
        for(Employee e : employees) {
            e.Accept(visitor);
        }
    }
}
