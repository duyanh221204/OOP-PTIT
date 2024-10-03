import java.util.*;
import java.io.*;
class Product implements Comparable<Product>
{
    private String code, name, group;
    private double bPrice, sPrice;
    public Product(int code, String name, String group, double bPrice, double sPrice)
    {
        this.code = "MH" + String.format ("%02d", code);
        this.name = name;
        this.group = group;
        this.bPrice = bPrice;
        this.sPrice = sPrice;
    }

    @Override
    public int compareTo(Product other)
    {
        return Double.compare(other.sPrice - other.bPrice, this.sPrice - this.bPrice);
    }

    @Override
    public String toString()
    {
        return this.code + " " + this.name + " " + this.group + " " + String.format ("%.2f", this.sPrice - this.bPrice);
    }
}
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i) a.add(new Product(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        Collections.sort(a);
        for (Product i : a) System.out.println (i);
    }
}
