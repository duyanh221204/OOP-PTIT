import java.util.*;
public class Main
{
    static class Time
    {
        int h, m, s;
        public Time(int h, int m, int s)
        {
            this.h = h;
            this.m = m;
            this.s = s;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) a.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        Collections.sort(a, (x, y) ->
        {
            if (x.h != y.h) return x.h - y.h;
            if (x.m != y.m) return x.m - y.m;
            return x.s - y.s;
        });
        for (Time i : a) System.out.println (i.h + " " + i.m + " " + i.s);
    }
}
