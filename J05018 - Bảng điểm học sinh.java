import java.util.*;
class Student implements Comparable<Student>
{
    private String code, name, status;
    private double mark;
    public Student(int code, String name, double[] d)
    {
        this.code = "HS" + String.format ("%02d", code);
        this.name = name;
        double s = 0;
        for (double i : d) s += i;
        this.mark = s / 12;
        if (this.mark >= 9) this.status = "XUAT SAC";
        else if (this.mark >= 8) this.status = "GIOI";
        else if (this.mark >= 7) this.status = "KHA";
        else if (this.mark >= 5) this.status = "TB";
        else this.status = "YEU";
    }

    @Override
    public int compareTo(Student other)
    {
        if (mark != other.mark) return Double.compare(other.mark, mark);
        return code.compareTo(other.code);
    }

    @Override
    public String toString()
    {
        return code + " " + name + " " + String.format ("%.1f", (double)Math.round(mark * 10) / 10) + " " + status;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i)
        {
            String name = sc.nextLine();
            double[] d = new double[10];
            for (int j = 0; j < 10; ++j) d[j] = sc.nextDouble();
            d[0] += d[0];
            d[1] += d[1];
            a.add(new Student(i, name, d));
            sc.nextLine();
        }
        Collections.sort(a);
        for (Student i : a) System.out.println (i);
    }
}
