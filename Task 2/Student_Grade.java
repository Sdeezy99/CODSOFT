import java.util.*;
import java.util.Scanner;
public class Student_Grade
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String subjects[] = new String[5];
        
        double totalMarks = 0;
        double avePercent = 0;
        char grade;
        
        System.out.print("How many subject have you done?: ");
        int num = sc.nextInt();
        String sub = sc.nextLine();
        
        for(int i= 0; i< num; i++)
        {
            System.out.print("Enter subject enrolled in: ");
            subjects[i] = sc.nextLine();
        }
        
        for(int i= 0; i< num; i++)
        {
            System.out.print("Enter the marks for " + subjects[i] + ": ");
            double mark = sc.nextDouble();
            
            totalMarks = totalMarks + mark;          
        }
        
        avePercent = Math.round(totalMarks/num);
        
        if (avePercent >= 80.0 || avePercent <= 100)
        {
            grade = 'A';
        }
        else if (avePercent >= 70.0 || avePercent < 80.0)
        {
            grade = 'B';
        }
        else if (avePercent >= 60.0 || avePercent < 70.0)
        {
            grade = 'C';
        }
        else if (avePercent >= 50.0 || avePercent < 60.0)
        {
            grade = 'D';
        }
        else if (avePercent >= 40.0 || avePercent < 50.0)
        {
            grade = 'E';
        }
        else
            grade = 'F';
        
        System.out.println("");
        System.out.println("Student total marks are: " + totalMarks);
        System.out.println("The Average percentage is: " + avePercent + "%");
        System.out.println("Student's grade achieved: " + grade);
    }
}
