import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String s = sc.nextLine();
            s = s.trim();
            String[] k = s.split("\\s+");
            for (int i = 1; i < k.length; ++i)
            {
                k[i] = k[i].toLowerCase();
                String tmp = k[i].substring(0, 1).toUpperCase();
                System.out.print (tmp + k[i].substring(1));
                if (i < k.length - 1) System.out.print (" ");
            }
            System.out.println (", " + k[0].toUpperCase());
        }
    }
}
