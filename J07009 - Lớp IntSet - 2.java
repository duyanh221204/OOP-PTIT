import java.util.*;
import java.io.*;
class IntSet
{
    private TreeSet<Integer> ss;
    public IntSet(int[] a)
    {
        TreeSet<Integer> ss = new TreeSet<>();
        for (int i : a) ss.add(i);
        this.ss = ss;
    }
    public IntSet intersection(IntSet s)
    {
        TreeSet<Integer> s1 = new TreeSet<>();
        IntSet ans = new IntSet(new int[]{});
        for (Integer i : this.ss) s1.add(i);
        for (Integer i : s.ss)
        {
            if (s1.contains(i)) ans.ss.add(i);
        }
        return ans;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Integer i : this.ss) sb.append(i).append(" ");
        return sb.toString().trim();
    }
}
public class Main
{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
