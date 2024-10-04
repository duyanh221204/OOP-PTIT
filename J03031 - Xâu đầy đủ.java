import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T-- > 0)
        {
            String s = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine());
            if (s.length() < 26) System.out.println ("NO");
            else
            {
                HashSet<Character> ss = new HashSet<>();
                for (int i = 0; i < s.length(); ++i) ss.add(s.charAt(i));
                if (26 - ss.size() <= k) System.out.println ("YES");
                else System.out.println ("NO");
            }
        }
    }
}
