import java.util.*;
class NhanVien
{
    private String ma, ten, gt, dob, dchi, mst, hd;
    public NhanVien(int ma, String ten, String gt, String dob, String dchi, String mst, String hd)
    {
        this.ma = String.format ("%05d", ma);
        this.ten = ten;
        this.gt = gt;
        this.dob = dob;
        this.dchi = dchi;
        this.mst = mst;
        this.hd = hd;
    }

    @Override
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.gt + " " + this.dob + " " + this.dchi + " " + this.mst + " " + this.hd;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; ++i) System.out.println (new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }
}
