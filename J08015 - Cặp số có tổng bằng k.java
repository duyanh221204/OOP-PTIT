import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
        {
            int n = sc.nextInt(), k = sc.nextInt();
            long[] a = new long[n];
            HashMap<Long, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; ++i)
            {
                a[i] = sc.nextLong();
                mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
            }
            long d = 0;
            if (k % 2 == 0)
            {
                if (mp.get((long)k >> 1) != null && mp.get((long)k >> 1) > 1)
                {
                    d += ((long)mp.get((long)k >> 1) * (mp.get((long)k >> 1) - 1) >> 1);
                    mp.put((long)k >> 1, 0);
                }
            }
            for (long i : a)
            {
                if (mp.get(i) != null && mp.get(k - i) != null && mp.get(i) > 0 && mp.get(k - i) > 0)
                {
                    d += ((long)mp.get(i) * mp.get(k - i));
                    mp.put(i, 0);
                    mp.put(k - i, 0);
                }
            }
            System.out.println (d);
        }
    }
}
