import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime_convert {
    public static void main(String[] args) {
        // Original date as a string
        String dateStr = "2022-03-17 10:45:30";
        // Creates a DateTimeFormatter object following the pattern used in the original string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // Saves LocalDateTime object as dateObj
        LocalDateTime dateObj = LocalDateTime.parse(dateStr, formatter);
        // Takes the dateObj and calls the format method on it, then saves that reformatted date as a string
        String formattedDate = dateObj.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"));

        // Prints the formatted date
        System.out.println(formattedDate);
    }
}
