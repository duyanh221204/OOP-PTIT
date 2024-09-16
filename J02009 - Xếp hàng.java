import java.util.*;
public class Main
{
    static class Pair
    {
        private int first, second;
        public Pair(int first, int second)
        {
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Pair> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) a.add(new Pair(sc.nextInt(), sc.nextInt()));
        Collections.sort(a, (x, y) ->
        {
            if (x.first != y.first) return x.first - y.first;
            return x.second - y.second;
        });
        long d = (long)a.get(0).first + a.get(0).second;
        for (int i = 1; i < n; ++i)
        {
            if (a.get(i).first >= d) d = (long)a.get(i).first + a.get(i).second;
            else d += a.get(i).second;
        }
        System.out.print (d);
    }
}
