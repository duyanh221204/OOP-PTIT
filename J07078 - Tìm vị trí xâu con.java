import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("STRING.in"));
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0)
        {
            String s1 = sc.nextLine(), s2 = sc.nextLine();
            int x = s1.indexOf(s2);
            while (x != -1)
            {
                System.out.print (x + 1 + " ");
                x = s1.indexOf(s2, x + 1);
            }
            System.out.println ();
        }
    }
}
