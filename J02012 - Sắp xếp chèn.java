import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
        for (int i = 0; i < n; ++i)
        {
            int x = a[i], id = i - 1;
            while (id >= 0 && a[id] > x) a[id + 1] = a[id--];
            a[id + 1] = x;
            System.out.print ("Buoc " + i + ": ");
            for (int j = 0; j <= i; ++j) System.out.print (a[j] + " ");
            System.out.println ();
        }
    }
}
