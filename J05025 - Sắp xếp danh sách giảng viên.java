import java.util.*;
class Lecturer implements Comparable<Lecturer>
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

    @Override
    public int compareTo(Lecturer other)
    {
        String[] s1 = name.trim().split("\\s+"), s2 = other.name.trim().split("\\s+");
        if (!s1[s1.length - 1].equals(s2[s2.length - 1])) return s1[s1.length - 1].compareTo(s2[s2.length - 1]);
        return code.compareTo(other.code);
    }

    @Override
    public String toString()
    {
        return code + " " + name + " " + subject;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Lecturer> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i) a.add(new Lecturer(i, sc.nextLine(), sc.nextLine()));
        Collections.sort(a);
        for (Lecturer i : a) System.out.println (i);
    }
}
