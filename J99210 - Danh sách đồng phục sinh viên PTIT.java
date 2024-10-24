import java.util.*;
import java.io.*;
class Student implements Comparable<Student>
{
    private String code, name, gender, group, email, phone;
    public Student(String code, String name, String gender, String group, String email, String phone)
    {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.group = group;
        this.email = email;
        this.phone = phone;
    }
    public String getCode()
    {
        return code;
    }
    public String getGender()
    {
        return gender;
    }

    @Override
    public int compareTo(Student other)
    {
        return this.code.compareTo(other.code);
    }

    @Override
    public String toString()
    {
        return this.code + " " + this.name + " " + this.group + " " + this.email + " " + this.phone;
    }
}
class Register
{
    private String code, size;
    public Register(String code, String size)
    {
        this.code = code;
        this.size = size;
    }
    public String getCode()
    {
        return code;
    }
    public String getSize()
    {
        return size;
    }
}
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i) a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(a);
        sc = new Scanner(new File("DANGKY.in"));
        Register[] b = new Register[n];
        for (int i = 0; i < n; ++i) b[i] = new Register(sc.next(), sc.next());
        sc = new Scanner(System.in);
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0)
        {
            String[] k = sc.nextLine().trim().split("\\s+");
            System.out.println ("DANH SACH SINH VIEN " + k[0].toUpperCase() + " DANG KY SIZE " + k[1]);
            for (Student i : a)
            {
                if (i.getGender().equals(k[0]))
                {
                    for (Register j : b)
                    {
                        if (i.getCode().equals(j.getCode()) && j.getSize().equals(k[1]))
                        {
                            System.out.println (i);
                            break;
                        }
                    }
                }
            }
        }
    }
}
