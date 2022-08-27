import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static String englishTime(String input) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss aa");
        DateFormat formate = new SimpleDateFormat("HH:mm:ss");
        Date time = null;
        String output = "";

        time = dateFormat.parse(input);
        output = formate.format(time);
       return output;
    }
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the time: ");
        String input = sc.nextLine();
        System.out.println(englishTime(input));




    }
}
