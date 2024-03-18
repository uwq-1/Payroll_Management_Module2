package PayrollManagement;

public class Manager extends  StaffMember{
    private double bonus = 3;


    public Manager(){}
    public Manager(double bonus) {
        this.bonus = bonus;
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return (getHoursWorked() *  2500 ) + bonus;
    }


    @Override
    public void displayInfo(){
        System.out.println("\nManager INFO :");
        System.out.println("Bonus: $" + bonus);
        System.out.println("Hours Worked: " + getHoursWorked());
        System.out.println("Total Salary: $" + calculateSalary());
    }


    @Override
    public void  display(){
        //System.out.println("\n");
        System.out.println("\nManager INFO :");
        super.display();
        System.out.println("Bonus : " + getBonus());
    }


}
