import java.math.BigInteger;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T-- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[n + 2], l = new int[n + 2], r = new int[n + 2];
            Stack<Integer> st = new Stack<>();
            for (int i = 1; i <= n; ++i)
            {
                a[i] = sc.nextInt();
                while (st.size() > 0 && a[i] <= a[st.peek()]) st.pop();
                if (st.empty()) l[i] = 0;
                else l[i] = st.peek();
                st.push(i);
            }
            st.clear();
            for (int i = n; i >= 1; --i)
            {
                while (st.size() > 0 && a[i] <= a[st.peek()]) st.pop();
                if (st.empty()) r[i] = n + 1;
                else r[i] = st.peek();
                st.push(i);
            }
            long d = 0;
            for (int i = 1; i <= n; ++i) d = Math.max((long)a[i] * (r[i] - l[i] - 1), d);
            System.out.println (d);
        }
    }
}
