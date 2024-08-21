import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int d4 = 0, d7 = 0;
        while (n > 0)
        {
            if (n % 10 == 4) ++d4;
            if (n % 10 == 7) ++d7;
            n /= 10;
        }
        if (d4 + d7 == 4 || d4 + d7 == 7) System.out.print ("YES");
        else System.out.print ("NO");
    }
}
