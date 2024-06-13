public class BankCustomer {
    int balance = 0;

    void DepositMoney(int amount)
    {
        balance = balance + amount;
        System.out.println("Money Deposited Successfully.");
    }

    void Withdraw(int amount)
    {
        if(amount > balance)
        {
            System.out.println("Insufficient Balance!");
        }
        else
        {
            balance = balance - amount;
            MessageToMobile(amount);
        }

    }

    void MessageToMobile(int amount)
    {
        System.out.println(amount + " is Credited From your Account");
    }

    void DisplayBalance()
    {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args)
    {
        BankCustomer C1 = new BankCustomer();

        C1.DepositMoney(5000);
        C1.DisplayBalance();
        C1.Withdraw(4000);
        C1.DisplayBalance();
        C1.Withdraw(2000);


    }
}
