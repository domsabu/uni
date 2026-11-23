package Week7.Lab;

public class Rectangle 
{
    private int width;
    private int length;

    public Rectangle(int width, int length) 
    {
        this.width = width;
        this.length = length;
    }

    public int calculatePerimeter()
        {
            int perimeter = 2 * (this.width + this.length);
            return perimeter;
        }

    public int calculateArea()
    {
        int area =  this.width * this.length;

        return area;
    }
}


