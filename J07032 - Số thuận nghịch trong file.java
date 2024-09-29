import java.util.*;
import java.io.*;
public class Main
{
    public static boolean kt(int n)
    {
        String s = Integer.toString(n);
        if (s.length() % 2 == 0 || s.length() == 1) return false;
        int l = 0, r = s.length() - 1;
        while (l <= r)
        {
            if (s.charAt(l) != s.charAt(r) || s.charAt(l) % 2 == 0 || s.charAt(r) % 2 == 0) return false;
            ++l;
            --r;
        }
        return true;
    }
    public static void main(String[] args) throws Exception
    {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        HashSet<Integer> ss = new HashSet<>(), ss1 = new HashSet<>();
        int[] k = new int[1000002];
        ArrayList<Integer> a = (ArrayList<Integer>)sc1.readObject(), b = (ArrayList<Integer>)sc2.readObject();
        for (Integer i : a)
        {
            ++k[i];
            ss1.add(i);
        }
        for (Integer i : b)
        {
            ++k[i];
            if (ss1.contains(i)) ss.add(i);
        }
        int d = 0;
        for (int i = 0; i <= 1000000; ++i)
        {
            if (ss.contains(i) && kt(i))
            {
                ++d;
                System.out.println (i + " " + k[i]);
                if (d == 10) break;
            }
        }
    }
}
