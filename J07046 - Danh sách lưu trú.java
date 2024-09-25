import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
class Customer implements Comparable<Customer>
{
    private String ID, name, roomCode;
    LocalDate start, end;
    public Customer(int ID, String name, String roomCode, String start, String end)
    {
        this.ID = "KH" + String.format ("%02d", ID);
        this.name = name;
        this.roomCode = roomCode;
        DateTimeFormatter d = DateTimeFormatter.ofPattern("d/M/y");
        this.start = LocalDate.parse(start, d);
        this.end = LocalDate.parse(end, d);
    }

    @Override
    public int compareTo(Customer other)
    {
        long s = ChronoUnit.DAYS.between(this.start, this.end), t = ChronoUnit.DAYS.between(other.start, other.end);
        return Long.compare(t, s);
    }

    @Override
    public String toString()
    {
        return this.ID + " " + this.name + " " + this.roomCode + " " + ChronoUnit.DAYS.between(this.start, this.end);
    }
}
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i) a.add(new Customer(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(a);
        for (Customer i : a) System.out.println (i);
    }
}
