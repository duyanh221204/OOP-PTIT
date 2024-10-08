import java.util.*;
import java.io.*;
class Mark implements Comparable<Mark>
{
    private String code, name;
    private double d;
    private String normalize_name(String s)
    {
        String[] k = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String i : k) sb.append(i.substring(0, 1).toUpperCase()).append(i.substring(1).toLowerCase()).append(" ");
        return sb.toString().trim();
    }
    public Mark(int code, String name, double d1, double d2, double d3)
    {
        this.code = "SV" + String.format ("%02d", code);
        this.name = normalize_name(name);
        this.d = (d1 * 3 + d2 * 3 + d3 * 2) / 8;
    }
    public double getD()
    {
        return this.d;
    }

    @Override
    public int compareTo(Mark other)
    {
        if (this.d != other.d) return Double.compare(other.d, this.d);
        return this.code.compareTo(other.code);
    }

    @Override
    public String toString()
    {
        return this.code + " " + this.name + " " + String.format ("%.2f", this.d);
    }
}
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Mark> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i) a.add(new Mark(i, sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        Collections.sort(a);
        int d = 1, h = 1;
        for (int i = 0; i < n; ++i)
        {
            if (i == 0 || a.get(i).getD() == a.get(i - 1).getD()) ++d;
            else h = d++;
            System.out.println (a.get(i) + " " + h);
        }
    }
}
