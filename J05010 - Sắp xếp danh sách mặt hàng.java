import java.util.*;
class Item implements Comparable<Item>
{
    private int code;
    private String name, type;
    private double cost;
    public Item(int code, String name, String type, double p, double s)
    {
        this.code = code;
        this.name = name;
        this.type = type;
        this.cost = s - p;
    }

    @Override
    public int compareTo(Item other)
    {
        return Double.compare(other.cost, cost);
    }

    @Override
    public String toString()
    {
        return code + " " + name + " " + type + " " + String.format ("%.2f", cost);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Item> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i) a.add(new Item(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        Collections.sort(a);
        for (Item i : a) System.out.println (i);
    }
}
