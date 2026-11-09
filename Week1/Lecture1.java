
public class Lecture1
{
    public static void main(String[] args)
    {
       
        char groupID = 'd'; 

        switch(groupID)
        {
        case 'a':
        System.out.println("10am - 12pm");
        break;
        case 'b':
        System.out.println("12am - 2pm");
        break;
        case 'c':
        System.out.println("2pm - 4pm");
        break;
        case 'd':
        System.out.println("4pm - 6pm");
        break;
        default:
        System.out.println("Not in the right groups");
        }

    }
}