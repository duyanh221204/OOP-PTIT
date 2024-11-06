import java.util.*;
class Student implements Comparable<Student>
{
    private String code, name, group, email;
    public Student(String code, String name, String group, String email)
    {
        this.code = code;
        this.name = name;
        this.group = group;
        this.email = email;
    }

    @Override
    public int compareTo(Student other)
    {
        if (!group.equals(other.group)) return group.compareTo(other.group);
        return code.compareTo(other.code);
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
        Collections.sort(a);
        for (Student i : a) System.out.println (i);
    }
}
