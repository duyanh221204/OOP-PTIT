import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt(), d = 0;
            int[] a = new int[n + 2];
            for (int i = 1; i <= n; ++i) a[i] = sc.nextInt();
            for (int i = 1; i < n; ++i)
            {
                if (a[i] > a[i + 1])
                {
                    d = i;
                    break;
                }
            }
            System.out.println (d);
        }
    }
}
