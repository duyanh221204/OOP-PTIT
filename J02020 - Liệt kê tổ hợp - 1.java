import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), d = 0;
        int[] a = new int[k + 2];
        for (int i = 1; i <= k; ++i) a[i] = i;
        while (true)
        {
            ++d;
            for (int i = 1; i <= k; ++i) System.out.print (a[i] + " ");
            System.out.println ();
            int x = k;
            while (x >= 1 && a[x] == n - k + x) --x;
            if (x == 0) break;
            ++a[x];
            for (int i = x + 1; i <= k; ++i) a[i] = a[i - 1] + 1;
        }
        System.out.print ("Tong cong co " + d + " to hop");
    }
}
