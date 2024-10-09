import java.util.*;
import java.io.*;
class Contestant implements Comparable<Contestant>
{
    private String code, name, people, status;
    private double mark;
    private int area;
    private String normalize_name(String s)
    {
        String[] k = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String i : k) sb.append(i.substring(0, 1).toUpperCase()).append(i.substring(1).toLowerCase()).append(" ");
        return sb.toString().trim();
    }
    public Contestant(int code, String name, double mark, String people, int area)
    {
        this.code = "TS" + String.format ("%02d", code);
        this.name = normalize_name(name);
        this.people = people;
        this.area = area;
        if (area == 1) mark += 1.5;
        else if (area == 2) mark += 1;
        if (!people.equals("Kinh")) mark += 1.5;
        this.mark = mark;
        if (mark >= 20.5) this.status = "Do";
        else this.status = "Truot";
    }

    @Override
    public int compareTo(Contestant other)
    {
        if (this.mark != other.mark) return Double.compare(other.mark, this.mark);
        return this.code.compareTo(other.code);
    }

    @Override
    public String toString()
    {
        return this.code + " " + this.name + " " + String.format ("%.1f", this.mark) + " " + this.status;
    }
}
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Contestant> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i) a.add(new Contestant(i, sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        Collections.sort(a);
        for (Contestant i : a) System.out.println (i);
    }
}
