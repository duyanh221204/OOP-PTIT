import java.util.*;
import java.io.*;
class Student implements Comparable<Student>
{
    private String code, name, group, mail;
    String normalize(String s)
    {
        s = s.trim();
        String[] k = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k.length; ++i)
        {
            sb.append(k[i].substring(0, 1).toUpperCase()).append(k[i].substring(1).toLowerCase());
            if (i < k.length - 1) sb.append(" ");
        }
        return sb.toString();
    }
    public Student(String code, String name, String group, String mail)
    {
        this.code = code;
        this.name = normalize(name);
        this.group = group;
        this.mail = mail;
    }

    @Override
    public int compareTo(Student other)
    {
        return this.code.compareTo(other.code);
    }

    @Override
    public String toString()
    {
        return this.code + " " + this.name + " " + this.group + " " + this.mail;
    }
}
public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(a);
        for (Student i : a) System.out.println (i);
    }
}
