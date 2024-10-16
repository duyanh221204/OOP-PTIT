import java.util.*;
class Point
{
    private double x, y;
    public Point()
    {
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public double dist(Point p)
    {
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }
}
class Triangle
{
    private Point a = new Point(), b = new Point(), c = new Point();
    private double d1, d2, d3;
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        a.setX(x1);
        a.setY(y1);
        b.setX(x2);
        b.setY(y2);
        c.setX(x3);
        c.setY(y3);
        this.d1 = a.dist(b);
        this.d2 = b.dist(c);
        this.d3 = c.dist(a);
    }

    @Override
    public String toString()
    {
        if (this.d1 + this.d2 > this.d3 && this.d1 + this.d3 > this.d2 && this.d2 + this.d3 > this.d1)
        {
            double p = (this.d1 + this.d2 + this.d3) / 2;
            double s = Math.sqrt(p * (p - this.d1) * (p - this.d2) * (p - this.d3));
            double r = (this.d1 * this.d2 * this.d3) / (4 * s);
            return String.format ("%.3f", Math.PI * r * r);
        }
        return "INVALID";
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) System.out.println (new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
    }
}
