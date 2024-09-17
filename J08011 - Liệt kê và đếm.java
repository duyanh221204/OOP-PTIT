import java.util.*;
public class Main
{
    public static boolean kt(String s)
    {
        for (int i = 1; i < s.length(); ++i)
        {
            if (s.charAt(i) < s.charAt(i - 1)) return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        HashMap<String, Integer> mp1 = new HashMap<>(), mp2 = new HashMap<>();
        int d = 0;
        while (sc.hasNext())
        {
            String s = sc.next();
            if (kt(s))
            {
                if (!mp1.containsKey(s))
                {
                    mp1.put(s, 1);
                    mp2.put(s, d++);
                    a.add(s);
                }
                else mp1.put(s, mp1.get(s) + 1);
            }
        }
        Collections.sort(a, (x, y) ->
        {
            if (!Objects.equals(mp1.get(x), mp1.get(y))) return mp1.get(y) - mp1.get(x);
            return mp2.get(x) - mp2.get(y);
        });
        for (String i : a) System.out.println (i + " " + mp1.get(i));
    }
}
