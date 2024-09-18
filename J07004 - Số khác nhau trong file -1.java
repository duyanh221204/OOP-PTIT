import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] k = new int[1000];
        while (sc.hasNextInt()) ++k[sc.nextInt()];
        for (int i = 0; i <= 999; ++i)
        {
            if (k[i] > 0) System.out.println (i + " " + k[i]);
        }
    }
}
