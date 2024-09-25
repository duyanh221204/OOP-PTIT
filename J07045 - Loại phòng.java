import java.util.*;
import java.io.*;
class LoaiPhong implements Comparable<LoaiPhong>
{
    private String sign, name, price, fee;
    public LoaiPhong(String s)
    {
        s = s.trim();
        String[] k = s.split("\\s+");
        this.sign = k[0];
        this.name = k[1];
        this.price = k[2];
        this.fee = k[3];
    }
    
    @Override
    public int compareTo(LoaiPhong other)
    {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString()
    {
        return this.sign + " " + this.name + " " + this.price + " " + this.fee;
    }
}
public class Main
{
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
