import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n * n; ++i) a.add(sc.nextInt());
        Collections.sort(a);
        int[][] b = new int[n][n];
        int r1 = 0, r2 = n - 1, c1 = 0, c2 = n - 1;
        while (r1 <= r2 && c1 <= c2)
        {
            for (int i = c1; i <= c2; ++i) b[r1][i] = a.get(x++);
            ++r1;
            for (int i = r1; i <= r2; ++i) b[i][c2] = a.get(x++);
            --c2;
            for (int i = c2; i >= c1; --i) b[r2][i] = a.get(x++);
            --r2;
            for (int i = r2; i >= r1; --i) b[i][c1] = a.get(x++);
            ++c1;
        }
        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < n; ++j) System.out.print (b[i][j] + " ");
            System.out.println ();
        }
    }
}
