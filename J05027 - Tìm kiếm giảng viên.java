import java.util.*;
class Lecturer
{
    private String code, name, subject;
    public Lecturer(int code, String name, String subject)
    {
        this.code = String.format ("GV%02d", code);
        this.name = name;
        String[] s = subject.trim().split("\\s+");
        this.subject = "";
        for (String i : s) this.subject += i.substring(0, 1).toUpperCase();
    }
    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return code + " " + name + " " + subject;
    }
}
public class Main
{
    public static boolean kt(String a, String b)
    {
        a = a.toUpperCase();
        b = b.toUpperCase();
        return a.contains(b);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Lecturer> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i) a.add(new Lecturer(i, sc.nextLine(), sc.nextLine()));
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0)
        {
            String key = sc.nextLine();
            System.out.println ("DANH SACH GIANG VIEN THEO TU KHOA " + key + ":");
            for (Lecturer i : a)
            {
                if (kt(i.getName(), key)) System.out.println (i);
            }
        }
    }
}
