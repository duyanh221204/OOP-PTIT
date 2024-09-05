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
            int d = 0;
            for (int i = 0; i < s.length() >> 1; ++i)
            {
                if (s.charAt(i) != s.charAt(s.length() - i - 1))
                {
                    ++d;
                    if (d > 1) break;
                }
            }
            if (d > 1 || (s.length() % 2 == 0 && d == 0)) System.out.println ("NO");
            else System.out.println ("YES");
        }
    }
}
