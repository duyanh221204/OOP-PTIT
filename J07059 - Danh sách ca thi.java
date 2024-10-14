import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;
class CaThi implements Comparable<CaThi>
{
    private String code, day, time, room;
    private LocalDateTime localDateTime;
    public CaThi(int code, String day, String time, String room)
    {
        this.code = String.format ("C%03d", code);
        this.day = day;
        this.time = time;
        this.room = room;
        DateTimeFormatter d = DateTimeFormatter.ofPattern("d/M/y H:m");
        this.localDateTime = LocalDateTime.parse(day + " " + time, d);
    }

    @Override
    public int compareTo(CaThi other)
    {
        if (this.localDateTime != other.localDateTime) return this.localDateTime.compareTo(other.localDateTime);
        return this.code.compareTo(other.code);
    }

    @Override
    public String toString()
    {
        return this.code + " " + this.day + " " + this.time + " " + this.room;
    }
}
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> a = new ArrayList<>();
        for (int i = 1; i <= n; ++i) a.add(new CaThi(i, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(a);
        for (CaThi i : a) System.out.println (i);
    }
}
