public class EvenNumbers
{
    public static void main(String[] args) 

    {
        int total = 0;
        for (int i = 2; i <= 20; i = i + 2)
        {
            System.out.println(i);
            total = total + i;
        }

        System.out.println("The sum of the numbers is " + total);
        
    }
}
