import java.util.*;
public class Main
{
    public static long tt(int[] a, int n)
    {
        int[] l = new int[n + 2], r = new int[n + 2];
        Stack<Integer> st = new Stack<>();
        for (int i = 1; i <= n; ++i)
        {
            while (!st.empty() && a[i] <= a[st.peek()]) st.pop();
            if (!st.empty()) l[i] = st.peek();
            else l[i] = 0;
            st.add(i);
        }
        st.clear();
        for (int i = n; i >= 1; --i)
        {
            while (!st.empty() && a[i] <= a[st.peek()]) st.pop();
            if (!st.empty()) r[i] = st.peek();
            else r[i] = n + 1;
            st.add(i);
        }
        long d = 0;
        for (int i = 1; i <= n; ++i) d = Math.max((long)a[i] * (r[i] - l[i] - 1), d);
        return d;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[] a = new int[n + 2], b = new int[n + 2];
        for (int i = 1; i <= n; ++i)
        {
            a[i] = sc.nextInt();
            b[i] = m - a[i];
        }
        System.out.print (Math.max(tt(a, n), tt(b, n)));
    }
}
