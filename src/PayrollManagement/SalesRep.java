/*
    Student Name : Garson Hutchinson
    Student Id # : 2101012660

*/

package PayrollManagement;

import java.util.List;

public class SalesRep extends StaffMember {

    private double allowance;
    //private List<StaffMember> staffMembers;
    private List<SalesRep> salesReps;



    public SalesRep(double allowance) {
        this.allowance = allowance;
    }

    public SalesRep(String firstName, String lastName, String deptNumber, double hoursWorked, double allowance) {
        super(firstName, lastName, deptNumber, hoursWorked);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }


    @Override
    public String toString(){
        return this.allowance +
                " " +
                this.getAllowance();
    }

    @Override
    public double calculateSalary() {
        return (getHoursWorked() *  1500 ) + allowance;
    }

    @Override
    public void displayInfo(){
        System.out.println("\nSales Rep INFO :");
        System.out.println("Hours Worked: " + getHoursWorked());
        System.out.println("Allowance: $" + allowance);
        System.out.println("Total Salary: $" + calculateSalary());
    }


    @Override
    public void display(){
        super.display();
        System.out.println("Allowance value is : " + getAllowance());
    }




}
