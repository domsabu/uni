public class CoinToss 
{
    public static void main(String[] args) 
    {
        int randomNumber =  (int) (Math.random() * 10);
        
        if (randomNumber > 2)
        {
            System.out.println("Heads!");
        }

        else
        {
            System.out.println("Tails!");
        }
    }
}
