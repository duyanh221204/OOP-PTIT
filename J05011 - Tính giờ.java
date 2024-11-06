import java.util.*;
class Player implements Comparable<Player>
{
    private String code, name;
    private int time, hour, minute;
    public Player(String code, String name, String st, String en)
    {
        this.code = code;
        this.name = name;
        String[] s = st.trim().split(":"), t = en.trim().split(":");
        this.time = Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]) - Integer.parseInt(s[0]) * 60 - Integer.parseInt(s[1]);
        this.hour = this.time / 60;
        this.minute = this.time % 60;
    }

    @Override
    public int compareTo(Player other)
    {
        return other.time - time;
    }

    @Override
    public String toString()
    {
        return code + " " + name + " " + hour + " gio " + minute + " phut";
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Player> a = new ArrayList<>();
        while (n-- > 0) a.add(new Player(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(a);
        for (Player i : a) System.out.println (i);
    }
}
