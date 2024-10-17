import java.util.*;
import java.time.*;
import java.time.format.*;
class Student
{
    private String code, name, group;
    private LocalDate dob;
    private double mark;
    public Student(int code, String name, String group, String dob, double mark)
    {
        this.code = String.format ("B20DCCN%03d", code);
        this.name = name;
        this.group = group;
        DateTimeFormatter d = DateTimeFormatter.ofPattern("d/M/y");
        this.dob = LocalDate.parse(dob, d);
        this.mark = mark;
    }

    @Override
    public String toString()
    {
        return this.code + " " + this.name + " " + this.group + " " + this.dob.format (DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " " + String.format ("%.2f", this.mark);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; ++i) System.out.println (new Student(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
    }
}
