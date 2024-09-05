import java.util.*;
public class Main
{
    public static String tt(char c)
    {
        if (c <= 67) return "2";
        if (c <= 70) return "3";
        if (c <= 73) return "4";
        if (c <= 76) return "5";
        if (c <= 79) return "6";
        if (c <= 83) return "7";
        if (c <= 86) return "8";
        return "9";
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0)
        {
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); ++i)
            {
                char c = s.charAt(i);
                if (c >= 97) c -= 32;
                sb.append(tt(c));
            }
            StringBuilder sb1 = new StringBuilder(sb);
            sb1.reverse();
            //System.out.println (sb1);
            String s1 = sb.toString(), s2 = sb1.toString();
            if (s1.equals(s2)) System.out.println ("YES");
            else System.out.println ("NO");
        }
    }
}
