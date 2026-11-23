
package Week7.Lab;

public class RectanglePro
{
    public static void main(String[] args)
    {
        Rectangle Rectangle1 = new Rectangle(5, 9);
        Rectangle Rectangle2 = new Rectangle(1, 4);
        Rectangle Rectangle3 = new Rectangle(4, 6);

        System.out.println(Rectangle1.calculateArea());
        System.out.println(Rectangle1.calculatePerimeter());

        System.out.println(Rectangle2.calculateArea());
        System.out.println(Rectangle1.calculatePerimeter());

        System.out.println(Rectangle3.calculateArea());
        System.out.println(Rectangle3.calculatePerimeter());
    }
}

