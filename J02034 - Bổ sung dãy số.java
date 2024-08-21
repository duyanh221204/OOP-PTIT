import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = 0, d1 = 0;
        int[] k = new int[202];
        while (n-- > 0)
        {
            int x = sc.nextInt();
            k[x] = 1;
            if (x > d1) d1 = x;
        }
        for (int i = 1; i <= d1; ++i)
        {
            if (k[i] == 0)
            {
                d = 1;
                System.out.println (i);
            }
        }
        if (d == 0) System.out.print ("Excellent!");
    }
}
