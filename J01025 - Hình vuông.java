import java.util.*;
public class Main
{
    public static int max(int a, int b)
    {
        return Math.max(a, b);
    }
    public static int min(int a, int b)
    {
        return Math.min(a, b);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt(), x3 = sc.nextInt(), y3 = sc.nextInt(), x4 = sc.nextInt(), y4 = sc.nextInt();
        int a = max(x1, max(x2, max(x3, x4))), b = min(x1, min(x2, min(x3, x4))), c = max(y1, max(y2, max(y3, y4))), d = min(y1, min(y2, min(y3, y4)));
        int z = max(a - b, c - d);
        System.out.print (z * z);
    }
}
