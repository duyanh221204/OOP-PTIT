import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 0, d = 1;
        for (int i = 1; i <= n; ++i)
        {
            d *= i;
            s += d;
        }
        System.out.print (s);
    }
}
