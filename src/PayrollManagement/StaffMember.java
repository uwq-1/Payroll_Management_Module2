/*
    Student Name : Garson Hutchinson
    Student Id # : 2101012660

*/
// Parent class

package PayrollManagement;
public abstract class StaffMember {

    private String firstName = "Unu";
    private String lastName = "Doe";
    private  String deptNumber = "111-888";

    private double hoursWorked = 4;


    public StaffMember (){

    }

    public  StaffMember (String firstName, String lastName, String deptNumber, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptNumber = deptNumber;
        this.hoursWorked = hoursWorked;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }

    public String getDeptNumber(){
        return deptNumber;
    }


    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public abstract double calculateSalary();
    public abstract void displayInfo();


    public void display(){
        System.out.println("Firstname is " + getFirstName());
        System.out.println("Lastname is  " + getLastName());
        System.out.println("Dep Number is " + getDeptNumber());
        System.out.println("Hours Work is " + getHoursWorked());
    }

}
