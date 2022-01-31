package org.example.VisitorPattern2;


/**
 * Created by will on 7/10/16.
 */
public class ManagerEmployee extends Employee {

    private String name;
    private int timeSheet;
    private double wage;
    private int punishmentTime;

    public ManagerEmployee(String name, int timeSheet, double wage, int punishmentTime) {
        this.name = name;
        this.timeSheet = timeSheet;
        this.wage = wage;
        this.punishmentTime = punishmentTime;
    }

    @Override
    public void accept(Department department) {
        department.visit(this);
    }

    public int getTotalTimeSheet(){
        return timeSheet * 22 - punishmentTime;
    }

    public double getTotalWage() {
        return wage - punishmentTime * 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeSheet() {
        return timeSheet;
    }

    public void setTimeSheet(int timeSheet) {
        this.timeSheet = timeSheet;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getPunishmentTime() {
        return punishmentTime;
    }

    public void setPunishmentTime(int punishmentTime) {
        this.punishmentTime = punishmentTime;
    }
}
