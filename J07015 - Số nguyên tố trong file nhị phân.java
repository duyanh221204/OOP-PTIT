import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) throws Exception
    {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> a = (ArrayList<Integer>)sc.readObject();
        int[] k = new int[10002], f = new int[10002];
        k[0] = k[1] = 1;
        for (int i = 2; i <= 100; ++i)
        {
            if (k[i] == 0)
            {
                for (int j = i * i; j <= 10000; j += i) k[j] = 1;
            }
        }
        for (Integer i : a) ++f[i];
        for (int i = 0; i < 10000; ++i)
        {
            if (f[i] > 0 && k[i] == 0) System.out.println (i + " " + f[i]);
        }
    }
}
