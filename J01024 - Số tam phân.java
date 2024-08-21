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
            for (int i = 0; i < s.length(); ++i)
            {
                if (s.charAt(i) > 50)
                {
                    d = 1;
                    System.out.println ("NO");
                    break;
                }
            }
            if (d == 0) System.out.println ("YES");
        }
    }
}
