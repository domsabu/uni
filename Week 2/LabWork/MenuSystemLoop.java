
import java.util.Scanner;

public class MenuSystemLoop
{
public static void main() 
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name");
    String name = scanner.nextLine();

    System.out.println("What is your age");
    int age = scanner.nextInt();

    scanner.nextLine();

    System.out.println("Where do you work");
    String workPlace = scanner.nextLine();

    String Continue;

    int Choice;

    do 
    {
        System.out.println("You have 4 choices, choose option (1-4)");
        System.out.println("Option 1: See your full name");
        System.out.println("Option 2: Remember where you work");
        System.out.println("Option 3: See how many years you have left until retirement");
        System.out.println("Option 4: Hear some personalised words of encouragement");
        
        Choice = scanner.nextInt();
        scanner.nextLine();

        while (Choice < 1 || Choice > 4)
        {
            System.out.println("Invalid range, please choose between option 1-4");
            Choice = scanner.nextInt();
            scanner.nextLine();
        }


        if (Choice == 1)
        {
            System.out.println("Your name is " + name);
            scanner.nextLine();
        }

        

        else if (Choice == 2)
        {
            System.out.println("You work at " + workPlace);
            scanner.nextLine();

        }

        else if(Choice == 3)
        {
            System.out.println("You have " + (65-age) + " years left till retirement");
            scanner.nextLine();
        }

        else if(Choice == 4)
        {
            System.out.println("You are an amazing indiviual");
            scanner.nextLine();
        }

        System.out.println("Do you want to continue");
        Continue = scanner.nextLine();


    }

    while (Continue.equals("Yes"));


}

}


   

