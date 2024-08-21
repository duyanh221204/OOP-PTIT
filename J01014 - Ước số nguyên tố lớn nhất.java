import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            long n = sc.nextLong(), d = 0;
            for (int i = 2; i <= Math.sqrt(n); ++i)
            {
                if (n % i == 0)
                {
                    d = i;
                    while (n % i == 0) n /= i;
                }
            }
            if (n > 1) d = n;
            System.out.println (d);
        }
    }
}
