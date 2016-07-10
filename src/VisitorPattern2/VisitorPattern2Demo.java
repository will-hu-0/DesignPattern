package VisitorPattern2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by will on 7/10/16.
 */
public class VisitorPattern2Demo {
    public static void main(String[] args) {

        List<Employee> employees = getEmployees();

        // Financial department starts calculating the wage of all employees
        FinancialDepartment financialDepartment = new FinancialDepartment();
        for (Employee employee : employees) {
            employee.accept(financialDepartment);
        }

        System.out.println("--------------------");

        // Financial department starts calculating the wage of all employees
        HRDepartment hrDepartment = new HRDepartment();
        for (Employee employee : employees) {
            employee.accept(hrDepartment);
        }

    }

    private static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new ManagerEmployee("Simon Patrick", 8, 25000, 10));
        employees.add(new ManagerEmployee("Will Hu", 8, 20000, 10));
        employees.add(new GeneralEmployee("Sophics Zac", 8, 35000, 8));
        employees.add(new GeneralEmployee("Joseph Jung", 5, 10000, 10));
        return employees;
    }
}
