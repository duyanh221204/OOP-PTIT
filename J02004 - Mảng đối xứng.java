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
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
            for (int i = 0; i < n >> 1; ++i)
            {
                if (a[i] != a[n - i - 1])
                {
                    d = 1;
                    System.out.println ("NO");
                    break;
                }
            }
            if (d == 0) System.out.println ("YES");
        }
    }
}
