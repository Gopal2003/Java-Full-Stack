public class EmployeeTest {
    String firstName;
    String lastName;
    double monthlySalary;

    EmployeeTest(String firstName,String lastName,double monthlySalary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    void setlastName(String lastName)
    {
        this.lastName = lastName;
    }

    void setMonthlySalary(double monthlySalary)
    {
        this.monthlySalary = monthlySalary;
    }

    String getFirstName()
    {
        return firstName;
    }

    String getLastName()
    {
        return lastName;
    }

    double getSalary()
    {
        return monthlySalary;
    }

    void displayYearlySalary()
    {
        double yearSalary = 0.0;

        //to get Yearly salary, We need to Multiply the Monthly Calary by 12 Because a Year Contains 12 months.
        yearSalary = monthlySalary * 12;
        System.out.println("The Yearly Salary of " + firstName + " " + lastName + " is " + yearSalary);
    }

    void salaryRaise()
    {
        //10% Increment in the Salary.
        double raise = (monthlySalary / 10);
        monthlySalary = monthlySalary + raise;
        System.out.println("The Raise in Salary is: " + raise);
    }

    

    //Main Function
    public static void main(String[] args)
    {
        EmployeeTest E1 = new EmployeeTest("Gopal", "Agarwal", 60000);
        EmployeeTest E2 = new EmployeeTest("Rajan", "Chetri", 100000);

        E1.displayYearlySalary();
        E1.salaryRaise();
        E1.displayYearlySalary();

        E2.displayYearlySalary();
        E2.salaryRaise();
        E2.displayYearlySalary();
        
    }

}
