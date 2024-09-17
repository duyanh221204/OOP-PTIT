import java.util.*;
public class Main
{
    public static int tt(String a, String b)
    {
        int d = 0;
        while (!a.equals(b) && d <= b.length())
        {
            ++d;
            a = a.substring(1) + a.charAt(0);
        }
        if (d <= b.length()) return d;
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = (int)2e9;
        sc.nextLine();
        String[] s = new String[n];
        for (int i = 0; i < n; ++i) s[i] = sc.nextLine();
        for (int i = 0; i < n; ++i)
        {
            int x = 0;
            for (int j = 0; j < n; ++j)
            {
                if (!s[i].equals(s[j]))
                {
                    int tmp = tt(s[j], s[i]);
                    if (tmp == -1)
                    {
                        x = -1;
                        break;
                    }
                    x += tmp;
                }
            }
            if (x == -1)
            {
                d = -1;
                break;
            }
            d = Math.min(x, d);
        }
        System.out.print (d);
    }
}
