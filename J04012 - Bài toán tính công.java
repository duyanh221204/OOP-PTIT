import java.util.*;
class NhanVien
{
    private String ma, ten;
    private long lt, lthg, pc, tn;
    public NhanVien(String ten, long lcb, long snc, String cv)
    {
        this.ma = "NV01";
        this.ten = ten;
        this.lt = lcb * snc;
        if (snc >= 25) this.lthg = (long)(this.lt * 0.2);
        else if (snc >= 22) this.lthg = (long)(this.lt * 0.1);
        if (cv.equals("GD")) this.pc = 250000;
        else if (cv.equals("PGD")) this.pc = 200000;
        else if (cv.equals("TP")) this.pc = 180000;
        else this.pc = 150000;
        this.tn = this.lt + this.lthg + this.pc;
    }

    @Override
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.lt + " " + this.lthg + " " + this.pc + " " + this.tn;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print (new NhanVien(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine()));
    }
}
