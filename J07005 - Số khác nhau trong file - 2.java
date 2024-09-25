import java.io.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] k = new int[1000];
        for (int i = 1; i <= 100000; ++i) ++k[sc.readInt()];
        for (int i = 0; i < 1000; ++i)
        {
            if (k[i] > 0) System.out.println (i + " " + k[i]);
        }
    }
}
