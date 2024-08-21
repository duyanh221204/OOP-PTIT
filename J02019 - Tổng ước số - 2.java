import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] k = new int[1000002];
        k[1] = 1;
        for (int i = 2; i <= 1000; ++i)
        {
            for (int j = i * i; j <= 1000000; j += i)
            {
                k[j] += (i + j / i);
                if (i * i == j) k[j] -= i;
            }
        }
        int a = sc.nextInt(), b = sc.nextInt(), d = 0;
        for (int i = a; i <= b; ++i)
        {
            if (k[i] > i) ++d;
        }
        System.out.print (d);
    }
}
