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
            if (s.isEmpty()) System.out.println ("YES");
            else
            {
                Stack<Character> st = new Stack<>();
                int d = 0;
                for (int i = 0; i < s.length(); ++i)
                {
                    if (s.charAt(i) == 40 || s.charAt(i) == 91 || s.charAt(i) == 123) st.add(s.charAt(i));
                    else
                    {
                        if (s.charAt(i) == 41)
                        {
                            if (st.empty() || st.peek() != 40)
                            {
                                d = 1;
                                break;
                            }
                            st.pop();
                        }
                        else if (s.charAt(i) == 93)
                        {
                            if (st.empty() || st.peek() != 91)
                            {
                                d = 1;
                                break;
                            }
                            st.pop();
                        }
                        else
                        {
                            if (st.empty() || st.peek() != 123)
                            {
                                d = 1;
                                break;
                            }
                            st.pop();
                        }
                    }
                }
                if (d == 1 || !st.empty()) System.out.println ("NO");
                else System.out.println ("YES");
            }
        }
    }
}
