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
            int[] a = new int[n + 2];
            for (int i = 1; i <= n; ++i) a[i] = sc.nextInt();
            Stack<Integer> st = new Stack<>();
            ArrayList<Integer> b = new ArrayList<>();
            for (int i = n; i >= 1; --i)
            {
                while (st.size() > 0 && a[i] >= a[st.peek()]) st.pop();
                if (st.empty()) b.add(-1);
                else b.add(a[st.peek()]);
                st.add(i);
            }
            for (int i = b.size() - 1; i >= 0; --i) System.out.print (b.get(i) + " ");
            System.out.println ();
        }
    }
}
