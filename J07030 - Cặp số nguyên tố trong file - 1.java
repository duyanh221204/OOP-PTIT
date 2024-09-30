import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) throws Exception
    {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        int[] k = new int[1000002], f = new int[1000002], h = new int[1000002];
        k[0] = k[1] = 1;
        for (int i = 2; i <= 1000; ++i)
        {
            if (k[i] == 0)
            {
                for (int j = i * i; j <= 1000000; j += i) k[j] = 1;
            }
        }
        ArrayList<Integer> a = (ArrayList<Integer>)sc1.readObject(), b = (ArrayList<Integer>)sc2.readObject();
        for (Integer i : a) f[i] = 1;
        for (Integer i : b) h[i] = 1;
        for (int i = 1; i < 500000; ++i)
        {
            if (k[i] == 0 && k[1000000 - i] == 0 && f[i] == 1 && h[1000000 - i] == 1) System.out.println (i + " " + (1000000 - i));
        }
    }
}
