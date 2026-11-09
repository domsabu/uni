public class HelloPlanets {
    
    public static void main(String[] args) 
    {

        String[] Planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        for(int i=0; i < Planets.length; i++)
        {
            String Planet = "Hello " + Planets[i];
            System.out.println(Planet);
        }
        
    }

}
