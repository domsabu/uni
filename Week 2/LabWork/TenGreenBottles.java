

public class TenGreenBottles
{
    public static void main(String[] args)
    {
        
        for (int i = 10; i >= 1; i -- )
        {
            System.out.println( i + " green bottles hanging on the wall\r\n" + //
                                i + " green bottles hanging on the wall\r\n" + //
                                "And if one green bottle should accidentally fall,\r\n" + //
                                "There'll be" +  (i-1) + " green bottles hanging on the wall");
        }
    }
}
