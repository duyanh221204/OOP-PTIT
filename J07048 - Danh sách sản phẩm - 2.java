import java.util.*;
import java.io.*;
class Product implements Comparable<Product>
{
    private String code, name;
    private int price, time;
    public Product(String code, String name, int price, int time)
    {
        this.code = code;
        this.name = name;
        this.price = price;
        this.time = time;
    }

    @Override
    public int compareTo(Product other)
    {
        if (this.price != other.price) return other.price - this.price;
        return this.code.compareTo(other.code);
    }

    @Override
    public String toString()
    {
        return this.code + " " + this.name + " " + this.price + " " + this.time;
    }
}
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> a = new ArrayList<>();
        while (n-- > 0) a.add(new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        Collections.sort(a);
        for (Product i : a) System.out.println (i);
    }
}
