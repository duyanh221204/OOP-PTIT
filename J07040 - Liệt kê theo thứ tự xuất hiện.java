import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) throws Exception
    {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner sc2 = new Scanner(new File("VANBAN.in"));
        ArrayList<String> a = (ArrayList<String>)sc1.readObject(), b = new ArrayList<>();
        for (String i : a)
        {
            String[] k = i.trim().split("\\s+");
            for (String j : k) b.add(j.toLowerCase());
        }
        HashSet<String> ss = new HashSet<>();
        for (String i : b) ss.add(i);
        while (sc2.hasNext())
        {
            String s = sc2.next().toLowerCase();
            if (ss.contains(s))
            {
                System.out.println (s);
                ss.remove(s);
            }
        }
    }
}
