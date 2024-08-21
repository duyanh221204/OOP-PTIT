import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st1 = new Stack<>(), st2 = new Stack<>();
        for (int i = 0; i < s.length(); ++i)
        {
            if (s.charAt(i) == 45)
            {
                if (st1.size() > 0) st1.pop();
            }
            else if (s.charAt(i) == 60)
            {
                if (st1.size() > 0)
                {
                    st2.add(st1.peek());
                    st1.pop();
                }
            }
            else if (s.charAt(i) == 62)
            {
                if (st2.size() > 0)
                {
                    st1.add(st2.peek());
                    st2.pop();
                }
            }
            else st1.add(s.charAt(i));
        }
        StringBuilder k = new StringBuilder();
        while (st1.size() > 0)
        {
            k.append(st1.peek());
            st1.pop();
        }
        k.reverse();
        while (st2.size() > 0)
        {
            k.append(st2.peek());
            st2.pop();
        }
        System.out.print (k);
    }
}
