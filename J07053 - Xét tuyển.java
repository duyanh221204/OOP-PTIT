import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;
class DS
{
    String code, name, status;
    int d;
    LocalDate dob;
    String normalize_name(String s)
    {
        String[] k = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String i : k) sb.append(i.substring(0, 1).toUpperCase()).append(i.substring(1).toLowerCase()).append(" ");
        return sb.toString().trim();
    }
    public DS(int code, String name, String dob, double d1, double d2)
    {
        this.code = "PH" + String.format ("%02d", code);
        this.name = normalize_name(name);
        DateTimeFormatter d = DateTimeFormatter.ofPattern("d/M/y");
        this.dob = LocalDate.parse(dob, d);
        double m = (d1 + d2) / 2;
        if (d1 >= 8 && d2 >= 8) m += 1.0;
        else if (d1 >= 7.5 && d2 >= 7.5) m += 0.5;
        this.d = Math.min(10, (int)Math.round(m));
        if (this.d < 5) this.status = "Truot";
        else if (this.d <= 6) this.status = "Trung binh";
        else if (this.d == 7) this.status = "Kha";
        else if (this.d == 8) this.status = "Gioi";
        else this.status = "Xuat sac";
    }

    @Override
    public String toString()
    {
        return this.code + " " + this.name + " " + (2021 - this.dob.getYear()) + " " + this.d + " " + this.status;
    }
}
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; ++i) System.out.println (new DS(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
    }
}
