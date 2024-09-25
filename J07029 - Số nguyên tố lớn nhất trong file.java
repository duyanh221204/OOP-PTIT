import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) throws Exception
    {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>)sc.readObject();
        int[] k = new int[1000002], f = new int[1000002];
        k[0] = k[1] = 1;
        for (int i = 2; i <= 1000; ++i)
        {
            if (k[i] == 0)
            {
                for (int j = i * i; j <= 1000000; j += i) k[j] = 1;
            }
        }
        for (Integer i : a) ++f[i];
        int d = 0;
        for (int i = 1000000; i >= 0; --i)
        {
            if (f[i] > 0 && k[i] == 0)
            {
                ++d;
                System.out.println (i + " " + f[i]);
                if (d == 10) break;
            }
        }
    }
}
