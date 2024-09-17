import java.util.*;
class Point
{
    private double x, y, k;
    Point()
    {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    Point(Point p)
    {
        this.x = p.x;
        this.y = p.y;
    }
    public double getX()
    {
        return this.x;
    }
    public double getY()
    {
        return this.y;
    }
    public double distance(Point p)
    {
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }
    public double distance(Point p1, Point p2)
    {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
    public void setDist(double k)
    {
        this.k = k;
    }

    @Override
    public String toString()
    {
        return String.format ("%.4f", this.k);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
        {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble()), p2 = new Point(sc.nextDouble(), sc.nextDouble());
            p1.setDist(p1.distance(p2));
            System.out.println (p1);
        }
    }
}
