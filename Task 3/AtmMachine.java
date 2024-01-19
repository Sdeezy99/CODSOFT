import java.util.Scanner;
public class AtmMachine
{
    private UserBankAccount userAccount;
    Scanner sc = new Scanner(System.in);
    
    
    
    public AtmMachine(UserBankAccount userAccount)// Composition is used in order to get the data from the userBankAccount class.
    {
        this.userAccount= userAccount;
    }
    
    public void displayATM()
    {
        System.out.println("Welcome, select one of the following options (1-4)");
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Deposit Amount");
        System.out.println("4. Exit");
        
    }
    
    
    
    public void checkBalance()
    {
        System.out.println("Current bank balance: R" + userAccount.remainingBalance());
    }
    
    public void withdrawAmount()
    {
        System.out.print("Enter amount to be withdrawn: R");
        double amount = sc.nextDouble();
        
        if (userAccount.withdraw(amount))
        {
            System.out.println("Amount has been withdrawn");
        }
        else
            System.out.println("Insufficent funds to withdraw");
    }
    
    public void depositAmount()
    {
        System.out.print("Enter amount to be withdrawn: R");
        double amount = sc.nextDouble();
        
        userAccount.deposit(amount);
        
    }
    
    public void exitATM()
    {
        System.out.println("Thank you for using the ATM, Goodbye.");
    }
    
    public void Bank()
    {
        String str = "";
        
        do
        {
            
        displayATM();
        System.out.println("Select an option (1-4): ");
        int option = sc.nextInt();
        if (option == 1)
        {
            checkBalance();
        }
        else if (option == 2)
        {
            withdrawAmount();
        }
        else if (option == 3)
        {
            depositAmount();
        }
        else if (option == 4)
        {
            exitATM();
            break;
        }
        else
        {
            System.out.println("Invalid option, try again");
        }
        System.out.println("Do you want to continue with another transaction? (Y/N):");
        Scanner opt = new Scanner(System.in);
        str = opt.nextLine();
        
        } while (str.equalsIgnoreCase("Y"));      
    }
    
}