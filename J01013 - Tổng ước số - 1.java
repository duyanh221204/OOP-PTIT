import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] k = new int[2000002];
        for (int i = 2; i <= 2000000; ++i)
        {
            if (k[i] == 0)
            {
                for (int j = i; j <= 2000000; j += i) k[j] = i;
            }
        }
        long s = 0;
        int n = sc.nextInt();
        while (n-- > 0)
        {
            int x = sc.nextInt();
            while (x > 1)
            {
                s += k[x];
                x /= k[x];
            }
        }
        System.out.print (s);
    }
}
