import java.util.*;
import java.time.*;
import java.time.format.*;
class Student
{
    private String name;
    public LocalDate dob;
    private double mark1, mark2, mark3;
    public Student(String name, String dob, double mark1, double mark2, double mark3)
    {
        this.name = name;
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dob = LocalDate.parse(dob, d);
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    public String toString()
    {
        return this.name + " " + this.dob.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " " + String.format("%.1f", this.mark1 + this.mark2 + this.mark3);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student s = new Student(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.print (s);
    }
}
