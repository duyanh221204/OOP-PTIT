import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args)
    {
        try
        {
            File F = new File("VANBAN.in");
            Scanner sc = new Scanner(F);
            TreeSet<String> ss = new TreeSet<>();
            while (sc.hasNextLine())
            {
                String s = sc.nextLine();
                s = s.trim().toLowerCase();
                String[] k = s.split("\\s+");
                for (String i : k) ss.add(i);
            }
            for (String i : ss) System.out.println (i);
        }
        catch (Exception _)
        {
        }
    }
}
