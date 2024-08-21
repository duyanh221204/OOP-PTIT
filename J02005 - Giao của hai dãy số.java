import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet<Integer> ss1 = new TreeSet<>(), ss2 = new TreeSet<>();
        while (n-- > 0)
        {
            int x = sc.nextInt();
            ss1.add(x);
        }
        while (m-- > 0)
        {
            int x = sc.nextInt();
            if (ss1.contains(x)) ss2.add(x);
        }
        for (int i : ss2) System.out.print (i + " ");
    }
}
