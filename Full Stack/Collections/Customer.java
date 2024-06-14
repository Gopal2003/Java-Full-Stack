public class Customer {
    
    private int balance;
    private String name;
    private String customerid;

    public Customer(int balance,String name,String customerid)
    {
        this.balance = balance;
        this.name = name;
        this.customerid = customerid;
    }

    public int getBalance()
    {
        return balance;
    }
    public String getName()
    {
        return name;
    }
    public String getCustomerid()
    {
        return customerid;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setCustomerid(String customerid)
    {
        this.customerid = customerid;
    }

    @Override
    public String toString()
    {
        return "Customer [ balance = " + balance + ", name= " + name + ", customerid= " + customerid + "]";
    }
}
