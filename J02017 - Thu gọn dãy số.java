import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        while (n-- > 0)
        {
            int x = sc.nextInt();
            if (st.empty() || (x + st.peek()) % 2 == 1) st.push(x);
            else st.pop();
        }
        System.out.print (st.size());
    }
}
