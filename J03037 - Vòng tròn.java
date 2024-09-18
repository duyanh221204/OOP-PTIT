import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int d = 0;
        for (int i = 0; i < s.length(); ++i)
        {
            int x = i + 1;
            while (x < s.length() && s.charAt(i) != s.charAt(x)) ++x;
            if (x < s.length())
            {
                int[] k = new int[92];
                for (int j = i + 1; j < x; ++j) ++k[s.charAt(j)];
                for (int j = i + 1; j < x; ++j)
                {
                    if (k[s.charAt(j)] == 1) ++d;
                }
            }
        }
        System.out.print (d >> 1);
    }
}
