import java.util.*;
import java.time.*;
import java.time.format.*;
class Student
{
    private String name, group;
    public LocalDate dob;
    private double mark;
    public Student(String name, String group, String dob, double mark)
    {
        this.name = name;
        this.group = group;
        DateTimeFormatter d = DateTimeFormatter.ofPattern("d/M/y");
        this.dob = LocalDate.parse(dob, d);
        this.mark = mark;
    }

    @Override
    public String toString()
    {
        return "B20DCCN001 " + this.name + " " + this.group + " " + this.dob.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " " + String.format("%.2f", this.mark);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student s = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        System.out.print (s);
    }
}
