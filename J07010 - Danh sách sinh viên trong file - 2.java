import java.text.DateFormat;
import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;
class Student
{
    private int code;
    private String name, group;
    private LocalDate dob;
    private double gpa;
    public Student(int code, String name, String group, String dob, double gpa)
    {
        this.code = code;
        this.name = name;
        this.group = group;
        DateTimeFormatter d = DateTimeFormatter.ofPattern("d/M/y");
        this.dob = LocalDate.parse(dob, d);
        this.gpa = gpa;
    }

    @Override
    public String toString()
    {
        return String.format ("B20DCCN%03d ", this.code) + this.name + " " + this.group + " " + this.dob.format (DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " " + String.format ("%.2f", this.gpa);
    }
}
public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; ++i) System.out.println (new Student(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
    }
}
