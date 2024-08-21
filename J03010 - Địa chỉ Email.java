import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> mp = new HashMap<>();
        while (t-- > 0)
        {
            String s = sc.nextLine(), h = "";
            s = s.trim().toLowerCase();
            String[] k = s.split("\\s+");
            h += k[k.length - 1];
            for (int i = 0; i < k.length - 1; ++i) h += k[i].charAt(0);
            if (mp.get(h) == null) mp.put(h, 1);
            else mp.put(h, mp.get(h) + 1);
            if (mp.get(h) == 1) System.out.print (h);
            else System.out.print (h + mp.get(h));
            System.out.println ("@ptit.edu.vn");
        }
    }
}
