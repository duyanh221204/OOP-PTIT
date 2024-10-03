import java.time.format.*;
import java.util.*;
import java.io.*;
import java.time.*;
import java.time.temporal.*;
class Customer implements Comparable<Customer>
{
    private String code, name;
    private int roomNum, sPrice;
    private long total;
    private LocalDate start, end;
    String normalize_name(String s)
    {
        String[] k = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String i : k) sb.append(i.substring(0, 1).toUpperCase()).append(i.substring(1).toLowerCase()).append(" ");
        return sb.toString().trim();
    }
    public Customer(int code, String name, int roomNum, String start, String end, int sPrice)
    {
        this.code = "KH" + String.format ("%02d", code);
        this.name = normalize_name(name);
        this.roomNum = roomNum;
        DateTimeFormatter d = DateTimeFormatter.ofPattern("d/M/y");
        this.start = LocalDate.parse(start, d);
        this.end = LocalDate.parse(end, d);
        this.sPrice = sPrice;
        int[] k = new int[10];
        k[1] = 25;
        k[2] = 34;
        k[3] = 50;
        k[4] = 80;
        this.total = (ChronoUnit.DAYS.between(this.start, this.end) + 1) * k[this.roomNum / 100] + this.sPrice;
    }

    @Override
    public int compareTo(Customer other)
    {
        return Long.compare(other.total, this.total);
    }

    @Override
    public String toString()
    {
        return this.code + " " + this.name + " " + this.roomNum + " " + (ChronoUnit.DAYS.between(this.start, this.end) + 1) + " " + this.total;
    }
}
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i) a.add(new Customer(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        Collections.sort(a);
        for (Customer i : a) System.out.println (i);
    }
}
