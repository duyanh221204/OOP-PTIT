import java.util.*;
class Student implements Comparable<Student>
{
    private int code;
    private String name, dob;
    private double mark;
    public Student(int code, String name, String dob, double d1, double d2, double d3)
    {
        this.code = code;
        this.name = name;
        this.dob = dob;
        this.mark = d1 + d2 + d3;
    }
    public double getMark()
    {
        return mark;
    }

    @Override
    public int compareTo(Student other)
    {
        if (mark != other.mark) return Double.compare(other.mark, mark);
        return code - other.code;
    }

    @Override
    public String toString()
    {
        return code + " " + name + " " + dob + " " + String.format ("%.1f", mark);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i) a.add(new Student(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        Collections.sort(a);
        for (int i = 0; i < n; ++i)
        {
            if (a.get(i).getMark() == a.get(0).getMark()) System.out.println (a.get(i));
            else break;
        }
    }
}
