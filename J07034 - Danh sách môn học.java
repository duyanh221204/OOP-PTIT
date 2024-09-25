import java.util.*;
import java.io.*;
class Subject implements Comparable<Subject>
{
    private String code, name;
    private int credit;
    public Subject(String code, String name, int credit)
    {
        this.code = code;
        this.name = name;
        this.credit = credit;
    }

    @Override
    public int compareTo(Subject other)
    {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString()
    {
        return this.code + " " + this.name + " " + this.credit;
    }
}
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) a.add(new Subject(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        Collections.sort(a);
        for (Subject i : a) System.out.println (i);
    }
}
