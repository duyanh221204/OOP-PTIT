import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt(), x, d = 0;
            x = (int)Math.sqrt(n);
            for (int i = 1; i <= x; ++i)
            {
                if (n % i == 0)
                {
                    if (i % 2 == 0) ++d;
                    if ((n / i) % 2 == 0 && i != n / i) ++d;
                }
            }
            System.out.println (d);
        }
    }
}
