public class UserBankAccount
{
    private double remBalance;
    private double amount;
    
    public UserBankAccount(double remBalance)
    {
        this.remBalance = remBalance;
    }
    
    public boolean deposit(double amount)
    {
        this.amount = amount;
        
        if (amount > 0)
        {
            remBalance = remBalance + amount;
            return true;
        }
        else    
            return false;
    }
    
    public boolean withdraw(double amount)
    {
        this.amount = amount;
        
        if (remBalance >= amount && amount > 0)
        {
            remBalance = remBalance - amount;
            return true;
        }
        else
            return false;
    }
    
    public double remainingBalance()
    {
        return remBalance;
    }
}
