import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<String> a = new ArrayList<>();
            Queue<String> q = new LinkedList<>();
            q.add("6");
            q.add("8");
            while (q.peek().length() <= n)
            {
                String s = q.peek();
                q.poll();
                a.add(s);
                q.add(s + "6");
                q.add(s + "8");
            }
            System.out.println (a.size());
            for (int i = a.size() - 1; i >= 0; --i) System.out.print (a.get(i) + " ");
            System.out.println ();
        }
    }
}
