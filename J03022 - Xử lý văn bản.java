import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNext()) a.add(sc.next().toLowerCase());
        String s = "";
        for (String i : a)
        {
            if (i.charAt(i.length() - 1) == '.' || i.charAt(i.length() - 1) == '?' || i.charAt(i.length() - 1) == '!')
            {
                String[] k = i.split("\\.");
                k = k[0].split("\\?");
                k = k[0].split("!");
                s += k[0];
                System.out.println (s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase());
                s = "";
            }
            else s += (i + " ");
        }
    }
}
