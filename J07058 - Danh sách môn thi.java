import java.util.*;
import java.io.*;
class Subject implements Comparable<Subject>
{
    private String code, name, type;
    public Subject(String code, String name, String type)
    {
        this.code = code;
        this.name = name;
        this.type = type;
    }

    @Override
    public int compareTo(Subject other)
    {
        return this.code.compareTo(other.code);
    }

    @Override
    public String toString()
    {
        return this.code + " " + this.name + " " + this.type;
    }
}
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> a = new ArrayList<>();
        while (n-- > 0) a.add(new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(a);
        for (Subject i : a) System.out.println (i);
    }
}
