import java.util.*;
class Student
{
    private String code, name, status;
    private double d, pr;
    public Student(String code, String name, double d1, double d2, double d3)
    {
        this.code = code;
        this.name = name;
        this.d = d1 * 2 + d2 + d3;
        if (code.substring(0, 3).equals("KV1")) this.pr = 0.5;
        else if (code.substring(0, 3).equals("KV2")) this.pr = 1;
        else this.pr = 2.5;
        double x = this.d + this.pr;
        if (x >= 24) this.status = "TRUNG TUYEN";
        else this.status = "TRUOT";
    }

    @Override
    public String toString()
    {
        String s = String.format ("%s %s ", code, name);
        if (pr == (int)pr) s += String.format ("%d ", (int)pr);
        else s += String.format ("%.1f ", pr);
        if (d == (int)d) s += String.format ("%d ", (int)d);
        else s += String.format ("%.1f ", d);
        s += status;
        return s;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print (new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
    }
}
