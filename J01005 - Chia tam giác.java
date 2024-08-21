import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
        {
            int n = sc.nextInt(), h = sc.nextInt();
            for (int i = 1; i < n; ++i) System.out.printf ("%.6f ", (double)h / Math.sqrt((double)n / i));
            System.out.println ();
        }
    }
}
