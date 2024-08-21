import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int x = (int)Math.sqrt(n);
            if (x * x == n) System.out.println ("YES");
            else System.out.println ("NO");
        }
    }
}
