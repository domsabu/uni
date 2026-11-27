
import java.util.Scanner;

public class Menu
{
// declared in class level so other methods can access
private static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) 
{

    System.out.println("What is your Name?");
    String name = scanner.nextLine();
    
    

    scanner.nextLine();

    

    String proceed;

    int Choice;

    do 
    {
        System.out.println("You have 4 choices" + name + ", choose option (1-4)");
        System.out.println("Option 1: Add a new workout");
        System.out.println("Option 2: Display Workout Summary");
        System.out.println("Option 3: Display Weekly Summary");
        System.out.println("Option 4: Display Personal Records");
        
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
            newWorkout();
        }

        

        else if (Choice == 2)
        {
           workoutSummary();
        }

        else if(Choice == 3)
        {
            allTimeSummary();
        }

        

        System.out.println("Do you want to continue");
        proceed = scanner.nextLine();

 
    }

    while (proceed.equals("Yes"));

}






private static void newWorkout()

{
    System.out.println("Enter the date of the workout");
    String Date = scanner.nextLine();

    System.out.println("Enter the duration of the workout");
    int duration = scanner.nextInt();
    
    System.out.println("Was the workout Cardio or Strength based?");
    String workoutType = scanner.nextLine();

    if (workoutType == "Strength")
    {
        ;
    }

    else if(workoutType == "Cardio")
    {
        ;
    }
}
   





private static void workoutSummary()
{
    

    
}

private static void allTimeSummary()
{
   
    
}



}


   

