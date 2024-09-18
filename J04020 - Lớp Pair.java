import java.util.*;
class Pair<S, T>
{
    private S first;
    private T second;
    public Pair(S first, T second)
    {
        this.first = first;
        this.second = second;
    }
    boolean kt(int n)
    {
        if (n < 2) return false;
        int x = (int)Math.sqrt(n);
        for (int i = 2; i <= x; ++i)
        {
            if (n % i == 0) return false;
        }
        return true;
    }
    public boolean isPrime()
    {
        return kt((Integer)this.first) && kt((Integer)this.second);
    }

    @Override
    public String toString()
    {
        return String.format ("%d %d", (Integer)this.first, (Integer)this.second);
    }
}
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
