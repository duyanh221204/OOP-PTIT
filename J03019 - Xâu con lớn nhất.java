import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(s.length() - 1);
        sb.append(c);
        for (int i = s.length() - 2; i >= 0; --i)
        {
            if (s.charAt(i) >= c)
            {
                c = s.charAt(i);
                sb.append(c);
            }
        }
        sb.reverse();
        System.out.print (sb);
    }
}
