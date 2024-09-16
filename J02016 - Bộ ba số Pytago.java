import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
        {
            int n = sc.nextInt(), d = 0;
            Long[] a = new Long[n];
            for (int i = 0; i < n; ++i)
            {
                a[i] = sc.nextLong();
                a[i] *= a[i];
            }
            Arrays.sort(a, Comparator.reverseOrder());
            for (int i = 0; i < n - 1; ++i)
            {
                int l = i + 1, r = n - 1;
                while (l < r)
                {
                    if (a[i] == a[l] + a[r])
                    {
                        d = 1;
                        System.out.println ("YES");
                        break;
                    }
                    if (a[i] > a[l] + a[r]) --r;
                    else ++l;
                }
                if (d == 1) break;
            }
            if (d == 0) System.out.println ("NO");
        }
    }
}
