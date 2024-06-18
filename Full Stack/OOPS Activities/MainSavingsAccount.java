public class MainSavingsAccount {
    public static void main(String[] args) {
        //Instantiating the Instance Variables.
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        //Initialising the savingsAccountBalance and Annual Intereset Rate. 
        saver1.setSavingsBalance(2000.0);
        saver2.setSavingsBalance(3000.0);
        SavingsAccount.annualInterestRate = 4;

        //Calling the CalculateMonthlyInterest function for both the users.
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        //Displaying the New Balance of both Users.
        saver1.displayBalance();
        saver2.displayBalance();
        
        //Setting the new Annual Interest Rate.
        SavingsAccount.annualInterestRate = 5;
        
        //Calling the CalculateMonthlyInterest function for both the users for new annual interest rate value.
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        //Displaying the New Balance of both Users.
        saver1.displayBalance();
        saver2.displayBalance();
        

    }
}
