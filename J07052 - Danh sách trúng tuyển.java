import java.text.DecimalFormat;
import java.util.*;
import java.io.*;
class Contestant implements Comparable<Contestant>
{
    private String code, name, status;
    private double d1, d2, d3, d;
    String normalize_name(String s)
    {
        String[] k = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String i : k) sb.append(i.substring(0, 1).toUpperCase()).append(i.substring(1).toLowerCase()).append(" ");
        return sb.toString().trim();
    }
    public Contestant(String code, String name, double d1, double d2, double d3)
    {
        this.code = code;
        this.name = normalize_name(name);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        String s = code.substring(0, 3);
        if (s.equals("KV1")) this.d = d1 * 2 + d2 + d3 + 0.5;
        else if (s.equals("KV2")) this.d = d1 * 2 + d2 + d3 + 1;
        else this.d = d1 * 2 + d2 + d3 + 2.5;
    }
    public double getD()
    {
        return this.d;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    @Override
    public int compareTo(Contestant other)
    {
        if (this.d != other.d) return Double.compare(other.d, this.d);
        return this.code.compareTo(other.code);
    }

    @Override
    public String toString()
    {
        HashMap<String, String> mp = new HashMap<>();
        mp.put("KV1", "0.5");
        mp.put("KV2", "1");
        mp.put("KV3", "2.5");
        return this.code + " " + this.name + " " + mp.get(this.code.substring(0, 3)) + " " + (new DecimalFormat().format(this.d)) + " " + this.status;
    }
}
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Contestant> a = new ArrayList<>();
        while (n-- > 0) a.add(new Contestant(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        int ct = Integer.parseInt(sc.nextLine());
        Collections.sort(a);
        if (a.size() < ct) ct = a.size();
        double dc = a.get(ct - 1).getD();
        System.out.printf ("%.1f\n", dc);
        for (Contestant i : a)
        {
            if (i.getD() >= dc) i.setStatus("TRUNG TUYEN");
            else i.setStatus("TRUOT");
            System.out.println (i);
        }
    }
}
