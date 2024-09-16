import java.util.*;
import java.time.*;
import java.time.format.*;
import java.io.*;
public class Main
{
    static class Student
    {
        private String name;
        private LocalDateTime startTime, endTime;
        public Student(String name, String startTime, String endTime)
        {
            this.name = name;
            DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            this.startTime = LocalDateTime.parse(startTime, d);
            this.endTime = LocalDateTime.parse(endTime, d);
        }
        public Long getOnlineMinutes()
        {
            return Duration.between(startTime, endTime).toMinutes();
        }
    }
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(a, (x, y) ->
        {
            if (!Objects.equals(x.getOnlineMinutes(), y.getOnlineMinutes()))
            {
                if (y.getOnlineMinutes() < x.getOnlineMinutes()) return -1;
                return 1;
            }
            return x.name.compareTo(y.name);
        });
        for (Student i : a) System.out.println (i.name + " " + i.getOnlineMinutes());
    }
}
