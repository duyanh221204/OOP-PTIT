import java.util.*;
import java.io.*;
class Subject implements Comparable<Subject>
{
    private String code, name, th, pr;
    private int credit;
    public Subject(String code, String name, int credit, String th, String pr)
    {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.th = th;
        this.pr = pr;
    }
    public String getPr()
    {
        return this.pr;
    }

    @Override
    public int compareTo(Subject other)
    {
        return this.code.compareTo(other.code);
    }

    @Override
    public String toString()
    {
        return this.code + " " + this.name + " " + this.credit + " " + this.th + " " + this.pr;
    }
}
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> a = new ArrayList<>();
        while (n-- > 0)
        {
            Subject sub = new Subject(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            if (!sub.getPr().equals("Truc tiep")) a.add(sub);
        }
        Collections.sort(a);
        for (Subject i : a) System.out.println (i);
    }
}
