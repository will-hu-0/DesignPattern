package VisitorPattern2;

/**
 * Created by will on 7/10/16.
 */
public class HRDepartment extends Department {

    @Override
    public void visit(ManagerEmployee managerEmployee) {
        System.out.println(managerEmployee.getName() + "工作时长为: " + managerEmployee.getTotalTimeSheet());
    }

    @Override
    public void visit(GeneralEmployee generalEmployee) {
        System.out.println(generalEmployee.getName() + "工作时长为: " + generalEmployee.getTotalTimeSheet());
    }
}
