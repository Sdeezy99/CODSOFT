
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main // This is the class we use to test the application(ATM)
{
    public static void main(String[] args)
    {
        UserBankAccount bank = new UserBankAccount(100.0); // user starts the ATM with R100 in the account
        AtmMachine atm = new AtmMachine(bank);
        
        atm.Bank();
    }
}
