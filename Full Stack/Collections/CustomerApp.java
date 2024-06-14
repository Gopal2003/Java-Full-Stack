import java.util.ArrayList;

public class CustomerApp{

    //Created a List of Customer Type, it means this list contains object of customers.
    ArrayList<Customer> customers = new ArrayList<>();

    public void registerCustomers(){

        //dummy code to generate data for 5 customers
        for(int i = 1; i <=5 ; i++)
        {
            Customer c = new Customer(i * 100,"Customer " + String.valueOf(i),String.valueOf(i));
            customers.add(c);
        }
    }

    public ArrayList<Customer> getLowBalanceCustomers(){
        ArrayList<Customer> lowBalCustomers = new ArrayList<>();

        //Using Enhanced for loop to iterate and Filter Customers Based on Balance < 300

        for(Customer cust : customers)
        {
            if(cust.getBalance() < 300)
            {
                lowBalCustomers.add(cust);
            }
        }

        return lowBalCustomers;
    }

    public void printAllCustomer()
    {
        for(Customer cust : customers)
        {
            System.out.println(cust);
        }
    }

    public static void main(String[] args)
    {
        //Creating an object of CustomerApp class.
        CustomerApp Capp = new CustomerApp();

        //Invoking few funcitons of the CustomerApp class.

        Capp.registerCustomers();
        Capp.printAllCustomer();

        System.out.println("Printing the Balance of Customer whose Balance is less than 300");
        System.out.println(Capp.getLowBalanceCustomers());

    }
}