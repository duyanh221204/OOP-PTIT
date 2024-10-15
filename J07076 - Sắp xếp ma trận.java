import java.util.*;
import java.io.*;
class Matrix
{
    private int rows, cols;
    private int[][] a;
    public Matrix(int rows, int cols, int[][] a)
    {
        this.rows = rows;
        this.cols = cols;
        this.a = a;
    }
    public void sortColumn(int index)
    {
        for (int i = 0; i < this.rows - 1; ++i)
        {
            for (int j = i + 1; j < this.rows; ++j)
            {
                if (this.a[i][index] > this.a[j][index])
                {
                    int x = this.a[i][index];
                    this.a[i][index] = this.a[j][index];
                    this.a[j][index] = x;
                }
            }
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.rows; ++i)
        {
            for (int j = 0; j < this.cols; ++j) sb.append(this.a[i][j]).append(" ");
            sb.append("\n");
        }
        return sb.toString();
    }
}
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int T = sc.nextInt();
        while (T-- > 0)
        {
            int n = sc.nextInt(), m = sc.nextInt(), id = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; ++i)
            {
                for (int j = 0; j < m; ++j) a[i][j] = sc.nextInt();
            }
            Matrix mt = new Matrix(n, m, a);
            mt.sortColumn(id - 1);
            System.out.println (mt);
        }
    }
}
