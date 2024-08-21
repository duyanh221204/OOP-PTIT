import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            Queue<Integer> q = new LinkedList<>();
            q.add(9);
            while (q.peek() % n > 0)
            {
                int m = q.peek();
                q.poll();
                q.add(m * 10);
                q.add(m * 10 + 9);
            }
            System.out.println (q.peek());
        }
    }
}
