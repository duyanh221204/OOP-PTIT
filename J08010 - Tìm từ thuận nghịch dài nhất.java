import java.util.*;
public class Main
{
    public static boolean kt(String s)
    {
        int l = 0, r = s.length() - 1;
        while (l < r)
        {
            if (s.charAt(l) != s.charAt(r)) return false;
            ++l;
            --r;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        HashMap<String, Integer> mp = new HashMap<>();
        int d = 0;
        while (sc.hasNext())
        {
            String s = sc.next();
            if (kt(s))
            {
                if (!mp.containsKey(s))
                {
                    mp.put(s, 1);
                    a.add(s);
                }
                else mp.put(s, mp.get(s) + 1);
                d = Math.max(s.length(), d);
            }
        }
        for (String i : a)
        {
            if (d == i.length()) System.out.println (i + " " + mp.get(i));
        }
    }
}
