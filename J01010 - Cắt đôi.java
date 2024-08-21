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
            StringBuilder sb = new StringBuilder();
            int d = 0;
            for (int i = 0; i < s.length(); ++i)
            {
                char c = s.charAt(i);
                if (c == 48 || c == 56 || c == 57) sb.append("0");
                else if (c == 49) sb.append("1");
                else
                {
                    d = 1;
                    System.out.println ("INVALID");
                    break;
                }
            }
            if (d == 0)
            {
                while (sb.length() > 0 && sb.charAt(0) == 48) sb.deleteCharAt(0);
                if (sb.length() == 0) System.out.println ("INVALID");
                else System.out.println (sb);
            }
        }
    }
}
