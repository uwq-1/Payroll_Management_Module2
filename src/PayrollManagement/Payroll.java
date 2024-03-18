/*
    Student Name : Garson Hutchinson
    Student Id # : 2101012660

*/

package PayrollManagement;

public class Payroll extends StaffMember{

    // Question 3
    // Within Payroll create an object of the base or super class called StaffMember using the primary
    //constructor, then call the object’s display() method. (1 Marks)

    //StaffMember obj = new StaffMember("don", "buk", "16", 15);

    static SalesRep salesRep = new SalesRep("Kite", "Brown", "44-11", 12, 3);
    static SalesRep salesRep1 = new SalesRep("Paul", "Blake", "22-11", 5, 4);

    static Manager manager = new Manager(15);

    @Override
    public double calculateSalary() {
        return 0;
    }



    public static void main(String[] args){
        manager.displayInfo();
        System.out.println("\n-------------------------------------");
        System.out.println("\nSales Rep INFO :");
        salesRep.displayInfo();
    }

    @Override
    public void displayInfo(){
        //System.out.println("Manager Name: " +);
        //System.out.println("Base Salary: $" + );
        //System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculateSalary());
    }


    @Override
    public void display() {
        super.display();
        System.out.println("Information here:");
        System.out.println("Name :  " + getFirstName() +  "  " + getLastName());
        System.out.println("DeptNo :" + getDeptNumber());
        System.out.println("Hours Worked  :" + getHoursWorked());
        salesRep1.getAllowance();
        salesRep.setAllowance(15);
        salesRep.getAllowance();
        manager.display();
    }


/*    public static void main(String[] args){
        System.out.println("\n\t\tStaff member Info:");
        obj.Display();
        System.out.println("\n\t\tSales Rep INFO :");
        salesRep.Display();
        System.out.println("\n");
        salesRep1.Display();
    }*/

}
