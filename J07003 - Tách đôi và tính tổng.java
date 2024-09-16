import java.math.BigInteger;
import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.nextLine();
        while (s.length() > 1)
        {
            String s1 = s.substring(0, s.length() >> 1), s2 = s.substring(s.length() >> 1);
            BigInteger a = new BigInteger(s1), b = new BigInteger(s2);
            System.out.println (a.add(b));
            s = a.add(b).toString();
        }
    }
}
