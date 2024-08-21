import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; ++tc)
        {
            int n = sc.nextInt();
            System.out.print ("Test " + tc + ": ");
            for (int i = 2; i <= Math.sqrt(n); ++i)
            {
                if (n % i == 0)
                {
                    int m = 0;
                    while (n % i == 0)
                    {
                        ++m;
                        n /= i;
                    }
                    if (m > 0) System.out.printf ("%d(%d) ", i, m);
                }
            }
            if (n > 1) System.out.print (n + "(1)");
            System.out.println ();
        }
    }
}
