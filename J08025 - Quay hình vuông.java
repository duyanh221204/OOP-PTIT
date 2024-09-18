import java.util.*;
public class Main
{
    static class Matrix
    {
        int[][] a;
        public Matrix(int[][] a)
        {
            this.a = a;
        }
        public boolean kt(Matrix a)
        {
            for (int i = 0; i <= 1; ++i)
            {
                for (int j = 0; j <= 2; ++j)
                {
                    if (this.a[i][j] != a.a[i][j]) return false;
                }
            }
            return true;
        }
    }
    static class Pair
    {
        Matrix first;
        int second;
        public Pair(Matrix first, int second)
        {
            this.first = first;
            this.second = second;
        }
    }
    public static Matrix copy(Matrix a)
    {
        Matrix b = new Matrix(new int[2][3]);
        for (int i = 0; i <= 1; ++i) System.arraycopy(a.a[i], 0, b.a[i], 0, 3);
        return b;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
        {
            Matrix a = new Matrix(new int[2][3]), b = new Matrix(new int[2][3]);
            for (int i = 0; i <= 1; ++i)
            {
                for (int j = 0; j <= 2; ++j) a.a[i][j] = sc.nextInt();
            }
            for (int i = 0; i <= 1; ++i)
            {
                for (int j = 0; j <= 2; ++j) b.a[i][j] = sc.nextInt();
            }
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(a, 0));
            while (!q.isEmpty())
            {
                Pair p = q.peek();
                q.poll();
                if (p.first.kt(b))
                {
                    System.out.println (p.second);
                    break;
                }
                Matrix c = copy(p.first);
                int x = c.a[0][0];
                c.a[0][0] = c.a[1][0];
                c.a[1][0] = c.a[1][1];
                c.a[1][1] = c.a[0][1];
                c.a[0][1] = x;
                /*for (int i = 0; i <= 1; ++i)
                {
                    for (int j = 0; j <= 2; ++j) System.out.print (c.a[i][j] + " ");
                    System.out.println ();
                }*/
                q.add(new Pair(c, p.second + 1));
                c = copy(p.first);
                x = c.a[0][1];
                c.a[0][1] = c.a[1][1];
                c.a[1][1] = c.a[1][2];
                c.a[1][2] = c.a[0][2];
                c.a[0][2] = x;
                /*for (int i = 0; i <= 1; ++i)
                {
                    for (int j = 0; j <= 2; ++j) System.out.print (c.a[i][j] + " ");
                    System.out.println ();
                }*/
                q.add(new Pair(c, p.second + 1));
            }
        }
    }
}
