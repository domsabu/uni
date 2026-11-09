import java.util.Scanner;

public class Story
{
public static void main(String[] args) 
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name");
    String name = scanner.nextLine();

    System.out.println("What is your age");
    String age = scanner.nextLine();

    System.out.println("What is your height");
    String height = scanner.nextLine();

    System.out.println("What is your position");
    String position = scanner.nextLine();

    System.out.println("What is your level");
    String level = scanner.nextLine();

    System.out.println(name + "is " + age + " and is" + height +  ". He plays the position " + position + "and plays " + level);

    scanner.close();




}    
}
