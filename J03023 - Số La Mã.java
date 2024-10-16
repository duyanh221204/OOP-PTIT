import java.util.*;
public class Main
{
    public static int tt(char c)
    {
        if (c == 73) return 1;
        if (c == 86) return 5;
        if (c == 88) return 10;
        if (c == 76) return 50;
        if (c == 67) return 100;
        if (c == 68) return 500;
        return 1000;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T-- > 0)
        {
            String s = sc.nextLine();
            long d = 0;
            for (int i = 0; i < s.length() - 1; ++i)
            {
                if (tt(s.charAt(i)) < tt(s.charAt(i + 1))) d -= tt(s.charAt(i));
                else d += tt(s.charAt(i));
            }
            d += tt(s.charAt(s.length() - 1));
            System.out.println (d);
        }
    }
}
