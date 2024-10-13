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
            String s1 = s.substring(0, s.length() >> 1), s2 = s.substring(s.length() >> 1);
            int d1 = 0, d2 = 0;
            for (int i = 0; i < s1.length(); ++i) d1 += (s1.charAt(i) - 65);
            for (int i = 0; i < s2.length(); ++i) d2 += (s2.charAt(i) - 65);
            //System.out.println (d1 + " " + d2);
            StringBuilder sb1 = new StringBuilder(), sb2 = new StringBuilder();
            for (int i = 0; i < s1.length(); ++i) sb1.append((char)((s1.charAt(i) - 65 + d1) % 26 + 65));
            for (int i = 0; i < s2.length(); ++i) sb2.append((char)((s2.charAt(i) - 65 + d2) % 26 + 65));
            //System.out.println (sb1 + " " + sb2);
            for (int i = 0; i < s2.length(); ++i) sb1.setCharAt(i, (char)((sb1.charAt(i) + sb2.charAt(i) - 130) % 26 + 65));
            //System.out.println (sb);
            System.out.println (sb1);
        }
    }
}
