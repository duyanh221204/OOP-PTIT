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
            String s = sc.nextLine().trim();
            String[] k = s.split("\\s+");
            ArrayList<Integer> a = new ArrayList<>();
            int d1 = 0, d2 = 0;
            for (String i : k)
            {
                int x = Integer.parseInt(i);
                a.add(x);
                if (x % 2 == 0) ++d1;
                else ++d2;
            }
            if ((d1 > d2 && a.size() % 2 == 0) || (d1 < d2 && a.size() % 2 == 1)) System.out.println ("YES");
            else System.out.println ("NO");
        }
    }
}
