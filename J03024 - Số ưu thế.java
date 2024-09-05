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
            if (s.charAt(0) == 48) System.out.println ("INVALID");
            else
            {
                int d = 0;
                for (int i = 0; i < s.length(); ++i)
                {
                    if (s.charAt(i) < 48 || s.charAt(i) > 57)
                    {
                        d = 1;
                        System.out.println ("INVALID");
                        break;
                    }
                }
                if (d == 0)
                {
                    int d1 = 0, d2 = 0;
                    for (int i = 0; i < s.length(); ++i)
                    {
                        if (s.charAt(i) % 2 == 0) ++d1;
                        else ++d2;
                    }
                    if (d1 == d2) System.out.println ("NO");
                    else
                    {
                        if ((s.length() % 2 == 0 && d1 > d2) || (s.length() % 2 == 1 && d1 < d2)) System.out.println ("YES");
                        else System.out.println ("NO");
                    }
                }
            }
        }
    }
}
