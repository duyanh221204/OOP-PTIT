import java.util.*;
class Point
{
    private double x, y;
    Point()
    {
        this.x = this.y = 0;
    }
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public Point(Point p)
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

    @Override
    public String toString()
    {
        return this.x + " " + this.y;
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
            Point a = new Point(sc.nextDouble(), sc.nextDouble()), b = new Point(sc.nextDouble(), sc.nextDouble()), c = new Point(sc.nextDouble(), sc.nextDouble());
            double d1 = a.distance(b), d2 = b.distance(c), d3 = c.distance(a);
            if (d1 + d2 > d3 && d1 + d3 > d2 && d2 + d3 > 1) System.out.printf ("%.3f\n", d1 + d2 + d3);
            else System.out.println ("INVALID");
        }
    }
}
