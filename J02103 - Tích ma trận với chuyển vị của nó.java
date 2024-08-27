import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int tc = 1; tc <= T; ++tc)
        {
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n + 2][m + 2];
            for (int i = 1; i <= n; ++i)
            {
                for (int j = 1; j <= m; ++j) a[i][j] = sc.nextInt();
            }
            long[][] b = new long[n + 2][n + 2];
            for (int i = 1; i <= n; ++i)
            {
                for (int j = 1; j <= n; ++j)
                {
                    for (int k = 1; k <= m; ++k) b[i][j] += ((long)a[i][k] * a[j][k]);
                }
            }
            System.out.printf ("Test %d:\n", tc);
            for (int i = 1; i <= n; ++i)
            {
                for (int j = 1; j <= n; ++j) System.out.print (b[i][j] + " ");
                System.out.println ();
            }
        }
    }
}
