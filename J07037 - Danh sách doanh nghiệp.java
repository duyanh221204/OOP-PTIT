import java.util.*;
import java.io.*;
class Company implements Comparable<Company>
{
    private String code, name;
    private int number;
    public Company(String code, String name, int number)
    {
        this.code = code;
        this.name = name;
        this.number = number;
    }

    @Override
    public int compareTo(Company other)
    {
        return this.code.compareTo(other.code);
    }

    @Override
    public String toString()
    {
        return this.code + " " + this.name + " " + this.number;
    }
}
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Company> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) a.add(new Company(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        Collections.sort(a);
        for (Company i : a) System.out.println (i);
    }
}
