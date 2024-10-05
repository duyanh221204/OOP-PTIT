import java.util.*;
import java.io.*;
public class Main
{
    public static long tt(String s)
    {
        long d = 0;
        for (int i = 0; i < s.length(); ++i) d += (s.charAt(i) - 48);
        return d;
    }
    public static void main(String[] args) throws Exception
    {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>)sc.readObject();
        for (String i : a)
        {
            String s = "";
            for (int j = 0; j < i.length(); ++j)
            {
                if (i.charAt(j) >= 48 && i.charAt(j) <= 57) s += i.charAt(j);
            }
            while (s.charAt(0) == 48) s = s.substring(1);
            if (!s.isEmpty()) System.out.println (s + " " + tt(s));
        }
    }
}
