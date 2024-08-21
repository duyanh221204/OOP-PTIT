import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
        for (int i = 0; i < n - 1; ++i)
        {
            int h = 0;
            for (int j = 0; j < n - i - 1; ++j)
            {
                if (a[j] > a[j + 1])
                {
                    h = 1;
                    int x = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = x;
                }
            }
            if (h == 1)
            {
                ++d;
                System.out.print ("Buoc " + d + ": ");
                for (int j : a) System.out.print (j + " ");
                System.out.println ();
            }
        }
    }
}
