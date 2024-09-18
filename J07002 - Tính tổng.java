import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DATA.in"));
        long s = 0;
        while (sc.hasNext())
        {
            try
            {
                s += Integer.parseInt(sc.next());
            }
            catch (Exception _)
            {
            }
        }
        System.out.print (s);
    }
}
