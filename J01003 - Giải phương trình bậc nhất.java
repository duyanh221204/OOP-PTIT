import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        if (a != 0)
        {
            if (b == 0) System.out.print ("VSN");
            else System.out.printf ("%.2f", -b / a);
        }
        else
        {
            if (b == 0) System.out.print ("VSN");
            else System.out.print ("VN");
        }
    }
}
