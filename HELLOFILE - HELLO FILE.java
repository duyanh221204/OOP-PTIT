import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        try
        {
            File F = new File("Hello.txt");
            Scanner sc = new Scanner(F);
            while (sc.hasNextLine()) System.out.println (sc.nextLine());
            sc.close();
        }
        catch (Exception _)
        {
        }
    }
}
