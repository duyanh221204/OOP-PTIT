import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet<Integer> ss = new TreeSet<>();
        while (n-- > 0)
        {
            int x = sc.nextInt();
            ss.add(x);
        }
        while (m-- > 0)
        {
            int x = sc.nextInt();
            ss.add(x);
        }
        for (int i : ss) System.out.print (i + " ");
    }
}
