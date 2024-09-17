import java.util.*;
public class Main
{
    public static boolean kt(char c)
    {
        return c == 54 || c == 56;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0)
        {
            String s = sc.nextLine();
            char a = s.charAt(5), b = s.charAt(6), c = s.charAt(7), d = s.charAt(9), e = s.charAt(10);
            if ((a < b && b < c && c < d && d < e) || (a == b && b == c && d == e) || (kt(a) && kt(b) && kt(c) && kt(d) && kt(e))) System.out.println ("YES");
            else System.out.println ("NO");
        }
    }
}
