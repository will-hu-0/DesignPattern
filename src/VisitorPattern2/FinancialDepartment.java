package VisitorPattern2;

/**
 * Created by will on 7/10/16.
 */

/**
 * Visit the wage of managers and general employee.
 */
public class FinancialDepartment extends Department {
    @Override
    public void visit(ManagerEmployee managerEmployee) {
        double totalWage = managerEmployee.getTotalWage();
        System.out.println("管理者: " + managerEmployee.getName() +
                "  固定工资 =" + managerEmployee.getWage() +
                ", 迟到时长 " + managerEmployee.getPunishmentTime() + "小时"+
                ", 实发工资="+totalWage);
    }

    @Override
    public void visit(GeneralEmployee generalEmployee) {
        double totalWage = generalEmployee.getTotalWage();
        System.out.println("普通员工: " + generalEmployee.getName() +
                "  固定工资 =" + generalEmployee.getWage() +
                ", 迟到时长 " + generalEmployee.getPunishmentTime() + "小时"+
                ", 实发工资="+totalWage);
    }
}
