import java.util.*;
class Company implements Comparable<Company>
{
    private String code, name;
    private int num;
    public Company(String code, String name, int num)
    {
        this.code = code;
        this.name = name;
        this.num = num;
    }

    @Override
    public int compareTo(Company other)
    {
        if (num != other.num) return other.num - num;
        return code.compareTo(other.code);
    }

    @Override
    public String toString()
    {
        return code + " " + name + " " + num;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Company> a = new ArrayList<>();
        while (n-- > 0) a.add(new Company(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        Collections.sort(a);
        for (Company i : a) System.out.println (i);
    }
}
