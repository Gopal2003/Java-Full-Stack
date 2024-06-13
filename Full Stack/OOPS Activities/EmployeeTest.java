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

    // double displayYearlySalary()
    // {

    // }

    

    //Main Function
    public static void main(String[] args)
    {

    }

}
