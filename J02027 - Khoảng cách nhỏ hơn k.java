import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
        {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
            Arrays.sort(a);
            long d = 0;
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < n; ++i)
            {
                while (q.size() > 0 && a[i] - a[q.peek()] >= k) q.poll();
                d += q.size();
                q.add(i);
            }
            System.out.println (d);
        }
    }
}
