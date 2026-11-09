import java.util.Scanner;

public class GuessANumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10 ) + 1;
        
        System.out.println("Guess the random number between 1-10");
        int userInput = scanner.nextInt();

        if (randomNumber == userInput)
        {
            System.out.println("Congrats you guessed correctly");
        }
        
        else
        {
            System.out.println("You guessed wrong");

        }

        scanner.close();
       
    }
} 