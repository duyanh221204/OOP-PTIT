import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T-- > 0)
        {
            String s = sc.nextLine();
            String[] k = s.split("\\s+");
            for (String i : k)
            {
                for (int j = i.length() - 1; j >= 0; --j) System.out.print (i.charAt(j));
                System.out.print (" ");
            }
            System.out.println ();
        }
    }
}
