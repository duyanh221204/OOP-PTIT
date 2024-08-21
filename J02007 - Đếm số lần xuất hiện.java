import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; ++tc)
        {
            System.out.print ("Test " + tc + ":\n");
            int n = sc.nextInt();
            int[] a = new int[n], k = new int[100002];
            for (int i = 0; i < n; ++i)
            {
                a[i] = sc.nextInt();
                ++k[a[i]];
            }
            for (int i = 0; i < n; ++i)
            {
                if (k[a[i]] > 0)
                {
                    System.out.printf ("%d xuat hien %d lan\n", a[i], k[a[i]]);
                    k[a[i]] = 0;
                }
            }
        }
    }
}
