import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = 0;
        while (n-- > 0)
        {
            int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt(), dem = 0;
            if (x == 1) ++dem;
            if (y == 1) ++dem;
            if (z == 1) ++dem;
            if (dem > 1) ++d;
        }
        System.out.print (d);
    }
}
