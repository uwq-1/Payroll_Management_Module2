package PayrollManagement;
import java.util.ArrayList;
import java.util.List;

/*
    Garson Hutchinson           2101012660
*/


public class Main {

    public static void main (String[] args) {

        //StaffMember obj = new StaffMember("Kira", "Doe", "7", 12);
        //System.out.println("\n**********Staff Members Info************\n");
        //obj.Display();

        // Question 4 : Create a list of 5 Sales Rep using an ArrayList.

        // Sales rep object
        SalesRep sals1 = new SalesRep(14);
        SalesRep sals2 = new SalesRep(12);
        SalesRep sals3 = new SalesRep(510);
        SalesRep sals4 = new SalesRep(100);
        SalesRep sals5 = new SalesRep(120);


        // added salesrep to a list
        List<SalesRep> salesReps = new ArrayList<>();
        salesReps.add(sals1);
        salesReps.add(sals2);
        salesReps.add(sals3);
        salesReps.add(sals4);
        salesReps.add(sals5);
        /*ArrayList<String> SalesRep = new ArrayList<String>();
        SalesRep.add("14");
        SalesRep.add("12");
        SalesRep.add("11");
        SalesRep.add("10");
        SalesRep.add("18");*/


        // Test functionality for Manager Class Display Method
        Manager manager = new Manager(12);


        System.out.println("Display INFO");
        //System.out.println(SalesRep);
        System.out.println(salesReps);

        System.out.println("\n");
        System.out.println("INFO:");
        Payroll payroll = new Payroll();
        payroll.display();

        // Call the Display method
        manager.display();


    }

}
