import java.util.*;
public class Main
{
    public static int kt(int n)
    {
        if (n < 2) return 0;
        if (n < 4) return 1;
        if ((n & 1) == 0 || n % 3 == 0) return 0;
        int x = (int)Math.sqrt(n);
        for (int i = 5; i <= x; i += 6)
        {
            if (n % i == 0 || n % (i + 2) == 0) return 0;
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            if (kt(n) == 1) System.out.println ("YES");
            else System.out.println ("NO");
        }
    }
}
