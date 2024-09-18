import java.util.*;
class PhanSo
{
    private long t, m;
    public PhanSo(long t, long m)
    {
        this.t = t;
        this.m = m;
    }
    long gcd(long a, long b)
    {
        while (b > 0)
        {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public void rutGon()
    {
        long mc = gcd(this.t, this.m);
        this.t /= mc;
        this.m /= mc;
    }
    public PhanSo tong(PhanSo p)
    {
        PhanSo ans = new PhanSo(1, 1);
        long mc = this.m / gcd(this.m, p.m) * p.m;
        this.t *= (mc / this.m);
        p.t *= (mc / p.m);
        ans.t = this.t + p.t;
        ans.m = mc;
        ans.rutGon();
        return ans;
    }

    @Override
    public String toString()
    {
        return this.t + "/" + this.m;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        PhanSo p1 = new PhanSo(sc.nextLong(), sc.nextLong()), p2 = new PhanSo(sc.nextLong(), sc.nextLong());
        System.out.print (p1.tong(p2));
    }
}
