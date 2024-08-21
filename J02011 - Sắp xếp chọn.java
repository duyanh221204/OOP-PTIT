import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
        for (int i = 0; i < n - 1; ++i)
        {
            int id = i;
            for (int j = i + 1; j < n; ++j)
            {
                if (a[id] > a[j]) id = j;
            }
            if (id != i)
            {
                int x = a[i];
                a[i] = a[id];
                a[id] = x;
            }
            System.out.print ("Buoc " + (i + 1) + ": ");
            for (int j : a) System.out.print (j + " ");
            System.out.println ();
        }
    }
}
