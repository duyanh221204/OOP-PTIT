import java.util.*;
import java.io.*;
class Mark implements Comparable<Mark>
{
    private String code, name, status;
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
        this.d = d1 * 0.25 + d2 * 0.35 + d3 * 0.4;
        if (d >= 8) this.status = "GIOI";
        else if (d >= 6.5) this.status = "KHA";
        else if (d >= 5) this.status = "TRUNG BINH";
        else this.status = "KEM";
    }

    @Override
    public int compareTo(Mark other)
    {
        return Double.compare(other.d, this.d);
    }

    @Override
    public String toString()
    {
        return this.code + " " + this.name + " " + String.format ("%.2f", this.d) + " " + this.status;
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
        for (Mark i : a) System.out.println (i);
    }
}
