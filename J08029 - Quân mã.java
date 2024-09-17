import java.util.*;
public class Main
{
    static class Pair
    {
        private int first, second;
        public Pair(int first, int second)
        {
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0)
        {
            String s1 = sc.next(), s2 = sc.next();
            int[] dx = {1, 2, 2, 1, -1, -2, -2, -1}, dy = {-2, -1, 1, 2, 2, 1, -1, -2};
            Pair x = new Pair(s1.charAt(0) - 96, s1.charAt(1) - 48), y = new Pair(s2.charAt(0) - 96, s2.charAt(1) - 48);
            int[][] k = new int[10][10];
            Queue<Pair> q = new LinkedList<>();
            q.add(x);
            while (!q.isEmpty())
            {
                Pair p = q.peek();
                q.poll();
                if (p.first == y.first && p.second == y.second)
                {
                    System.out.println (k[y.first][y.second]);
                    break;
                }
                for (int i = 0; i < 8; ++i)
                {
                    int tx = p.first + dx[i], ty = p.second + dy[i];
                    if (tx >= 1 && tx <= 8 && ty >= 1 && ty <= 8 && k[tx][ty] == 0)
                    {
                        k[tx][ty] = k[p.first][p.second] + 1;
                        q.add(new Pair(tx, ty));
                    }
                }
            }
        }
    }
}
