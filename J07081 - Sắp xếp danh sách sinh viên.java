import java.util.*;
import java.io.*;
class Student implements Comparable<Student>
{
    private String code, name, phone, email;
    public Student(String code, String name, String phone, String email)
    {
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public int compareTo(Student other)
    {
        String[] s1 = this.name.split("\\s+"), s2 = other.name.split("\\s+");
        if (!s1[s1.length - 1].equals(s2[s2.length - 1])) return s1[s1.length - 1].compareTo(s2[s2.length - 1]);
        if (!s1[0].equals(s2[0])) return s1[0].compareTo(s2[0]);
        for (int i = 1; i < Math.min(s1.length, s2.length) - 1; ++i)
        {
            if (!s1[i].equals(s2[i])) return s1[i].compareTo(s2[i]);
        }
        return this.code.compareTo(other.code);
    }

    @Override
    public String toString()
    {
        return this.code + " " + this.name + " " + this.phone + " " + this.email;
    }
}
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        while (n-- > 0) a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(a);
        for (Student i : a) System.out.println (i);
    }
}
