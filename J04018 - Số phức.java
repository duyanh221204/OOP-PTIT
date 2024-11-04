import java.util.*;
class SoPhuc
{
    private int t, a;
    public SoPhuc(int t, int a)
    {
        this.t = t;
        this.a = a;
    }
    public SoPhuc cong(SoPhuc p)
    {
        return new SoPhuc(t + p.t, a + p.a);
    }
    public SoPhuc nhan(SoPhuc p)
    {
        return new SoPhuc(t * p.t - a * p.a, t * p.a + a * p.t);
    }

    @Override
    public String toString()
    {
        String s = "";
        s += t;
        if (a >= 0) s += (" + " + a + "i");
        else s += (" - " + Math.abs(a) + "i");
        return s;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
        {
            SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt()), b = new SoPhuc(sc.nextInt(), sc.nextInt());
            System.out.println (a.nhan(a.cong(b)) + ", " + a.cong(b).nhan(a.cong(b)));
        }
    }
}
