import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<String> ss = new HashSet<>();
        for (int i = 0; i < s.length(); ++i) ss.add(s.substring(i, i + 1));
        System.out.print (ss.size());
    }
}
