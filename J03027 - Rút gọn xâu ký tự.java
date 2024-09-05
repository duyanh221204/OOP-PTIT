import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); ++i)
        {
            if (st.empty() || st.peek() != s.charAt(i)) st.add(s.charAt(i));
            else st.pop();
        }
        StringBuilder sb = new StringBuilder();
        while (st.size() > 0)
        {
            sb.append(st.peek());
            st.pop();
        }
        sb.reverse();
        if (sb.length() == 0) System.out.print ("Empty String");
        else System.out.print (sb);
    }
}
