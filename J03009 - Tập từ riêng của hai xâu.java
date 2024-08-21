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
            String s1 = sc.nextLine(), s2 = sc.nextLine();
            String[] k1 = s1.split("\\s+"), k2 = s2.split("\\s+");
            TreeSet<String> ss1 = new TreeSet<>(), ss2 = new TreeSet<>(Arrays.asList(k2));
            for (String i : k1)
            {
                if (!ss2.contains(i)) ss1.add(i);
            }
            for (String i : ss1) System.out.print (i + " ");
            System.out.println ();
        }
    }
}
