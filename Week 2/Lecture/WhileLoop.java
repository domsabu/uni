import java.util.Scanner;


public class WhileLoop
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int i = 0; 

        while (i < 100)
        {
            System.out.println("Enter a number");
            i = scanner.nextInt();

        }

    }
}
