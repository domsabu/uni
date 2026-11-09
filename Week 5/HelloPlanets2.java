import java.util.Scanner;


public class HelloPlanets2 
{
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String [] Planets = new String[8]; 
        for(int i = 0; i < 8; i++)
        {
            System.out.println("Enter a planet");
            Planets[i] = "hello" + scanner.nextLine();
            System.out.println(Planets[i]);

        }

    }

}
