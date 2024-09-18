import java.util.*;
class Rectangle
{
    private long width, height;
    private String color;
    String normalize(String s)
    {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
    Rectangle()
    {
        this.width = this.height = 1;
    }
    public Rectangle(long width, long height, String color)
    {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public long getWidth()
    {
        return this.width;
    }
    public void setWidth(long width)
    {
        this.width = width;
    }
    public long getHeight()
    {
        return this.height;
    }
    public void setHeight(long height)
    {
        this.height = height;
    }
    public String getColor()
    {
        return normalize(this.color);
    }
    public void setColor(String color)
    {
        this.color = normalize(color);
    }
    public long findArea()
    {
        return this.width * this.height;
    }
    public long findPerimeter()
    {
        return this.width + this.height << 1;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt(), height = sc.nextInt();
        String color = sc.nextLine().trim();
        if (width <= 0 || height <= 0) System.out.print ("INVALID");
        else
        {
            Rectangle h = new Rectangle(width, height, color);
            System.out.print (h.findPerimeter() + " " + h.findArea() + " " + h.getColor());
        }
    }
}
