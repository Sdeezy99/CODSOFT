import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class Number_Game
{

    public static void Main(String[]args)
    {
        Random randomNo = new Random();
        int rNum = randomNo.nextInt(100) + 1;
        int numOfGuesses = 0;
        int x = 10;
        String decision = " "; 
        Scanner sc = new Scanner(System.in);
        Scanner scDecision = new Scanner(System.in);
        System.out.println("Guess the generated number (1-100) in 10 attempts to win!!!" );
        System.out.println("NB the program will terminate if instructions are not followed." );
        System.out.println("Now let the games begin!!! :)" );
        
        System.out.println("Guess the generated number (1-100): ");
        int num = sc.nextInt();
        for(int i = 0; i < x; i++) 
        {

            if (num == rNum)
            {
                System.out.println("Number guessed is correct!!!");
    
            }
            else if (num > rNum)
            {
                System.out.println("Number guessed is too high...");

                
            }
            else if (num < rNum)
            {
                System.out.println("Number guessed is too low... Try again.");
            }
            
            numOfGuesses++;
            System.out.println("Do you want to guess again (Y/N): ");
            decision = scDecision.nextLine().toLowerCase();
            
            if (decision.equals("n") )
            {
                break;
            }
            else if (decision.equals("y"))
            {
                System.out.println("Guess the generated number (1-100): ");
                num = sc.nextInt();    
            }
            else
            {
                System.out.println("Game is terminated due to incorrect input...");
                break;
            }
            
        }    
        
        System.out.println("Thank you for playing...");
        System.out.println("Number of guesses tried: " + numOfGuesses);
               
    }
}
