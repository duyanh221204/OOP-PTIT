import java.util.*;
class Student
{
    private String code, name, group, email;
    public Student(String code, String name, String group, String email)
    {
        this.code = code;
        this.name = name;
        this.group = group;
        this.email = email;
    }
    public String getCohort()
    {
        return group.substring(1, 3);
    }

    @Override
    public String toString()
    {
        return code + " " + name + " " + group + " " + email;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        while (n-- > 0) a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0)
        {
            String cohort = sc.nextLine();
            System.out.println ("DANH SACH SINH VIEN KHOA " + cohort + ":");
            for (Student i : a)
            {
                if (i.getCohort().equals(cohort.substring(2))) System.out.println (i);
            }
        }
    }
}
