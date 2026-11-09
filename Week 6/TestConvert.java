
public class TestConvert 
{
    private static int convert(int number)
    {
        if(number > 20)
        {
            return number * 2;
        }
        
        else if(number < 5)
        {
            return number - 5;
        }
        else
        {
            return 10;
        }
        }


    public static void main()
    {
        System.out.println(convert(29));

    }
}
