import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0)
        {
            int a = sc.nextInt(), b = sc.nextInt();
            if (a <= 0 || b <= 0) System.out.print ("0");
            else System.out.print ((a + b) * 2 + " " + a * b);
        }
    }
}
