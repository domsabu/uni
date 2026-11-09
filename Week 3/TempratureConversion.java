public class TempratureConversion 
{
    public static void main() 
    {
        System.out.println(FahrenheitConversionToCelcius(32));
        System.out.println(CelciusConversionToFarenheit(20));
    }

    private static double FahrenheitConversionToCelcius(double Farenheit)
    {
        double Celcius = (Farenheit - 32) * 5/9;
        return Celcius;
    }


    private static double CelciusConversionToFarenheit(double Celcius)
    {
        double Farenheit = (Celcius * 9/5) + 32;
        return Farenheit;
    }
}


