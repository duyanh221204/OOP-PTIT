import java.util.*;
import java.time.*;
import java.time.format.*;
class Staff
{
    private String name, gender, address, taxID;
    private LocalDate dob, ctDate;
    public Staff(String name, String gender, String dob, String address, String taxID, String ctDate)
    {
        this.name = name;
        this.gender = gender;
        DateTimeFormatter d = DateTimeFormatter.ofPattern("d/M/y");
        this.dob = LocalDate.parse(dob, d);
        this.address = address;
        this.taxID = taxID;
        this.ctDate = LocalDate.parse(ctDate, d);
    }

    @Override
    public String toString()
    {
        return "00001 " + this.name + " " + this.gender + " " + this.dob.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " " + this.address + " " + this.taxID + " " + this.ctDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print (new Staff(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }
}
