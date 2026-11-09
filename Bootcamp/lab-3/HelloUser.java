import java.util.Scanner;

public class HelloUser
{
  public static void main(String[] args)
  {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name");
    String UserInput = scanner.nextLine();
    System.out.println("Hello it is was very nice to meet you " + UserInput);
    System.out.println("Greetings my friend " + UserInput + " nice to meet you!");
    System.out.println("Hello " + UserInput);

    
    scanner.close();
  }
}
