import java.util.*;
class PhanSo
{
    private long t, m;
    public PhanSo(long t, long m)
    {
        this.t = t;
        this.m = m;
    }
    private long gcd(long a, long b)
    {
        while (b > 0)
        {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    private void rutGon()
    {
        long x = gcd(t, m);
        t /= x;
        m /= x;
    }
    public PhanSo tong(PhanSo p)
    {
        PhanSo tmp = this;
        long mc = tmp.m / gcd(tmp.m, p.m) * p.m;
        //System.out.println (tmp.t + " " + p.t);
        PhanSo z = new PhanSo((tmp.t * mc / tmp.m) + (p.t * mc / p.m), mc);
        z.rutGon();
        return z;
    }
    public PhanSo nhan(PhanSo p)
    {
        PhanSo z = new PhanSo(t * p.t, m * p.m);
        z.rutGon();
        return z;
    }

    @Override
    public String toString()
    {
        return t + "/" + m;
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
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong()), b = new PhanSo(sc.nextLong(), sc.nextLong());
            //System.out.println (a.tong(b));
            PhanSo z = a.tong(b);
            PhanSo c = z.nhan(z);
            PhanSo d = a.nhan(b).nhan(c);
            System.out.println (c + " " + d);
        }
    }
}
