import java.util.*;
public class Main
{
    public static StringBuilder max(int n, int s)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s / 9; ++i) sb.append("9");
        if (s % 9 > 0) sb.append(s % 9);
        while (sb.length() < n) sb.append("0");
        return sb;
    }
    public static StringBuilder min(StringBuilder s)
    {
        StringBuilder sb = new StringBuilder(s).reverse();
        if (sb.charAt(0) == 48)
        {
            for (int i = 1; i < sb.length(); ++i)
            {
                if (sb.charAt(i) > 48)
                {
                    int c1 = sb.charAt(0) + 1, c2 = sb.charAt(i) - 1;
                    sb.setCharAt(0, (char)c1);
                    sb.setCharAt(i, (char)c2);
                    break;
                }
            }
        }
        return sb;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        if (n * 9 < s || (n > 1 && s == 0)) System.out.print ("-1 -1");
        else System.out.print (min(max(n, s)) + " " + max(n, s));
    }
}
