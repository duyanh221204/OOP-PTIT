import java.util.*;
import java.io.*;
public class Main
{
    public static void tt(int[] a, ArrayList<Integer> b, ArrayList<String> v, int x, int n)
    {
        for (int i = x + 1; i <= n; ++i)
        {
            if (a[x] < a[i])
            {
                b.add(a[i]);
                if (b.size() > 1)
                {
                    String s = "";
                    for (Integer j : b) s += (j + " ");
                    v.add(s);
                }
                tt(a, b, v, i, n);
                b.remove(b.size() - 1);
            }
        }
    }
    public static void main(String[] args)
    {
        try
        {
            File F = new File("DAYSO.in");
            Scanner sc = new Scanner(F);
            int n = 0, d = 0, x = 1;
            String s = "";
            String[] k = {};
            while (sc.hasNextLine())
            {
                ++d;
                if (d == 1) n = Integer.parseInt(sc.nextLine());
                else s = sc.nextLine();
            }
            k = s.split("\\s+");
            int[] a = new int[n + 2];
            for (int i = 0; i < k.length; ++i) a[x++] = Integer.parseInt(k[i]);
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<String> v = new ArrayList<>();
            tt(a, b, v, 0, n);
            Collections.sort(v);
            for (String i : v) System.out.println (i);
        }
        catch (Exception _)
        {
        }
    }
}
