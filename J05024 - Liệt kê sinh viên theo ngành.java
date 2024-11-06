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
    public String getCode()
    {
        return code;
    }
    public String getGroup()
    {
        return group.substring(0, 1);
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
            String field = sc.nextLine().toUpperCase(), code;
            System.out.println ("DANH SACH SINH VIEN NGANH " + field + ":");
            if (field.equals("KE TOAN")) code = "DCKT";
            else if (field.equals("CONG NGHE THONG TIN")) code = "DCCN";
            else if (field.equals("AN TOAN THONG TIN")) code = "DCAT";
            else if (field.equals("VIEN THONG")) code = "DCVT";
            else code = "DCDT";
            for (Student i : a)
            {
                if (code.equals("DCCN") || code.equals("DCAT"))
                {
                    if (i.getCode().contains(code))
                    {
                        if (!i.getGroup().equals("E")) System.out.println (i);
                    }
                }
                else
                {
                    if (i.getCode().contains(code)) System.out.println (i);
                }
            }
        }
    }
}
