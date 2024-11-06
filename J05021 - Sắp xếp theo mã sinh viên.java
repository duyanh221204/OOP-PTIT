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
        ArrayList<Student> a = new ArrayList<>();
        ArrayList<String> s = new ArrayList<>();
        while (sc.hasNextLine())
        {
            s.add(sc.nextLine());
            if (s.size() == 4)
            {
                a.add(new Student(s.get(0), s.get(1), s.get(2), s.get(3)));
                s.clear();
            }
        }
        Collections.sort(a);
        for (Student i : a) System.out.println (i);
    }
}
