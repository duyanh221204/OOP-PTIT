import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
        {
            int s = sc.nextInt(), t = sc.nextInt(), d = 0;
            while (s < t)
            {
                if (t % 2 == 1) ++t;
                else t /= 2;
                ++d;
            }
            System.out.println (s - t + d);
        }
    }
}
