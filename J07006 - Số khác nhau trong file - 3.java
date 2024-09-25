import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) throws Exception
    {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>)sc.readObject();
        int[] k = new int[1000];
        for (Integer i : a) ++k[i];
        for (int i = 0; i < 1000; ++i)
        {
            if (k[i] > 0) System.out.println (i + " " + k[i]);
        }
    }
}
