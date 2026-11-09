import java.util.Scanner;
public class DoWhile 
{
    public static void main(String[] args)
    {
       int i = 99;
       Scanner scanner = new Scanner(System.in);

// difference betwen a while loop is that the first line will always run no matter what, but for while loop if condition isn't met it will skip

       do 
       { 
          System.out.println("Enter a number more than 100");
          i = scanner.nextInt();


       } while (i<100); 
    }
}
