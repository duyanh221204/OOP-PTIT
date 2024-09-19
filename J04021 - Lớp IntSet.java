import java.util.*;
class IntSet
{
    private TreeSet<Integer> ss;
    public IntSet(int[] a)
    {
        TreeSet<Integer> s = new TreeSet<>();
        for (int i : a) s.add(i);
        ss = s;
    }
    public IntSet union(IntSet s)
    {
        IntSet s1 = new IntSet(new int[]{});
        s1.ss.addAll(this.ss);
        s1.ss.addAll(s.ss);
        return s1;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Integer i : this.ss) sb.append(i).append(" ");
        return sb.toString();
    }
}
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
