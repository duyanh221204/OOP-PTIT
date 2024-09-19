import java.util.*;
class WordSet
{
    private TreeSet<String> ss;
    public WordSet(String s)
    {
        s = s.trim().toLowerCase();
        String[] k = s.split("\\s+");
        TreeSet<String> s1 = new TreeSet<>(Arrays.asList(k));
        this.ss = s1;
    }
    public WordSet union(WordSet s)
    {
        WordSet s1 = new WordSet("");
        s1.ss.addAll(this.ss);
        s1.ss.addAll(s.ss);
        return s1;
    }
    public WordSet intersection(WordSet s)
    {
        WordSet s1 = new WordSet(""), s2 = new WordSet("");
        s1.ss.addAll(this.ss);
        for (String i : s.ss)
        {
            if (s1.ss.contains(i)) s2.ss.add(i);
        }
        return s2;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (String i : this.ss) sb.append(i).append(" ");
        return sb.toString().trim();
    }
}
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
    public static void main7947670(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
