import java.util.*;
import java.io.*;
public class Main
{
    public static ArrayList<String> tt(String s)
    {
        String[] k = s.trim().split("\\s+");
        ArrayList<String> a = new ArrayList<>();
        for (String i : k) a.add(i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase());
        return a;
    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<ArrayList<String>> a = new ArrayList<>();
        while (sc.hasNextLine()) a.add(tt(sc.nextLine()));
        Collections.sort(a, (x, y) ->
        {
            if (!x.get(x.size() - 1).equals(y.get(y.size() - 1))) return x.get(x.size() - 1).compareTo(y.get(y.size() - 1));
            if (!x.get(0).equals(y.get(0))) return x.get(0).compareTo(y.get(0));
            for (int i = 1; i < Math.min(x.size(), y.size()) - 1; ++i)
            {
                if (!x.get(i).equals(y.get(i))) return x.get(i).compareTo(y.get(i));
            }
            return x.size() - y.size();
        });
        for (ArrayList<String> i : a)
        {
            for (String j : i) System.out.print (j + " ");
            System.out.println ();
        }
    }
}
