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
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; ++i)
            {
                while (!st.empty() && a[i] >= a[st.peek()]) st.pop();
                if (!st.empty()) System.out.print (i - st.peek() + " ");
                else System.out.print (i + 1 + " ");
                st.add(i);
            }
            System.out.println ();
        }
    }
}
