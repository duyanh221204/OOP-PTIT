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
        PhanSo p = new PhanSo(sc.nextLong(), sc.nextLong());
        p.rutGon();
        System.out.print (p);
    }
}
