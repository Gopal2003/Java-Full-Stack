public class SavingsAccount {

    //Initialising the variables.
    static double annualInterestRate;
    private double savingsBalance;

    //Initialising Getter and Setter Method.
    void setAnnualInterestRate(double annualIR)
    {
        annualInterestRate = annualIR;
    }
    void setSavingsBalance(double savingsBalance)
    {
       this.savingsBalance = savingsBalance;
    }
    
    double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    //Method to calculate the monthly interest
    void calculateMonthlyInterest()
    {
        double interest = (savingsBalance * annualInterestRate) / 12.0;
        savingsBalance = savingsBalance + interest;
    }

    //Method to Modify the Interest Rate.
    static void modidyInterestRate(double annualIR)
    {
        annualInterestRate = annualIR;
    }

    void displayBalance()
    {
        System.out.println("New Balance: " + savingsBalance);
    }
}
