import java.util.*;
import java.time.*;
import java.time.format.*;
class NhanVien implements Comparable<NhanVien>
{
    private String ma, ten, gt, dob, dchi, mst, hd;
    private LocalDate date;
    public NhanVien(int ma, String ten, String gt, String dob, String dchi, String mst, String hd)
    {
        this.ma = String.format ("%05d", ma);
        this.ten = ten;
        this.gt = gt;
        this.dob = dob;
        this.dchi = dchi;
        this.mst = mst;
        this.hd = hd;
        DateTimeFormatter d = DateTimeFormatter.ofPattern("d/M/y");
        this.date = LocalDate.parse(dob, d);
    }

    @Override
    public int compareTo(NhanVien other)
    {
        return date.compareTo(other.date);
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
        ArrayList<NhanVien> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i) a.add(new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(a);
        for (NhanVien i : a) System.out.println (i);
    }
}
