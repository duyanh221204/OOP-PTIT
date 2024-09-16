import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0)
        {
            String s = sc.nextLine();
            if (s.isEmpty())
            {
                System.out.println ("0");
                continue;
            }
            int d = 0;
            Stack<Integer> st = new Stack<>();
            st.add(-1);
            for (int i = 0; i < s.length(); ++i)
            {
                if (s.charAt(i) == 40) st.add(i);
                else
                {
                    st.pop();
                    if (!st.empty()) d = Math.max(i - st.peek(), d);
                    else st.push(i);
                }
            }
            System.out.println (d);
        }
    }
}
