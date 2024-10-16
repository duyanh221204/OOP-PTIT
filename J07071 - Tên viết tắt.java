import java.util.*;
import java.io.*;
public class Main
{
    public static boolean kt(String a, String b)
    {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); ++i)
        {
            if (a.charAt(i) != 42)
            {
                if (a.charAt(i) != b.charAt(i)) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String[]> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) a.add(sc.nextLine().trim().split("\\s+"));
        Collections.sort(a, (x, y) ->
        {
            if (!x[x.length - 1].equals(y[y.length - 1])) return x[x.length - 1].compareTo(y[y.length - 1]);
            return x[0].compareTo(y[0]);
        });
        ArrayList<String> b = new ArrayList<>();
        for (String[] i : a)
        {
            String s = "";
            for (int j = 0; j < i.length - 1; ++j) s += (i[j].charAt(0) + ".");
            s += i[i.length - 1].charAt(0);
            b.add(s);
        }
        int m = Integer.parseInt(sc.nextLine());
        while (m-- > 0)
        {
            String s = sc.nextLine();
            for (int i = 0; i < n; ++i)
            {
                //System.out.println (b.get(i));
                if (kt(s, b.get(i)))
                {
                    for (String j : a.get(i)) System.out.print (j + " ");
                    System.out.println ();
                }
            }
        }
    }
}
