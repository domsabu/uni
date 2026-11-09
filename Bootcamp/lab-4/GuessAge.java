import java.util.Scanner;

public class GuessAge 
{
public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter your age");
        int Age = scanner.nextInt();
        scanner.nextLine();
        int birthYear = (2019-Age);

        System.out.println(birthYear);
        System.out.println("Is the calculated birth year correct?");
        String userInput = scanner.nextLine();

        if (userInput.equals("y"))
        {
            System.out.println("Great!"); 
        }

        if (userInput.equals("n"))
        {
            System.out.println(birthYear-1);
        }
        scanner.close();
    }


}
    

