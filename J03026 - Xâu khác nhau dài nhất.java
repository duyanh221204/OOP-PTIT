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
            String a = sc.nextLine(), b = sc.nextLine();
            if (a.equals(b)) System.out.println ("-1");
            else System.out.println (Math.max(a.length(), b.length()));
        }
    }
}
