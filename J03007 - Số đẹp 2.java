import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String s = sc.nextLine();
            if (s.charAt(0) != 56 || s.charAt(s.length() - 1) != 56) System.out.println ("NO");
            else
            {
                int d = 0;
                for (int i = 0; i < s.length() >> 1; ++i)
                {
                    if (s.charAt(i) != s.charAt(s.length() - i - 1))
                    {
                        d = 1;
                        System.out.println ("NO");
                        break;
                    }
                }
                if (d == 0)
                {
                    for (int i = 0; i < s.length(); ++i) d += (s.charAt(i) - 48);
                    if (d % 10 == 0) System.out.println ("YES");
                    else System.out.println ("NO");
                }
            }
        }
    }
}
