import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class basic {
    public static void main(String[] args) {

        // LOCALDATE

        // LocalDate ld = LocalDate.now();
        // System.out.println(ld); // Gives current date

        // LocalDate newDate = ld.plusDays(1); // adding 1 day to current date
        // System.out.println(newDate);

        // LocalDate minDate = ld.minusDays(1); // subtracting 1 day from current date

        // LocalDate ld1 = LocalDate.of(2011, 9, 16);
        // System.out.println(ld1.isLeapYear()); // check if that year is a leap year

        // LocalTime

        // LocalTime lt = LocalTime.now();
        // System.out.println(lt); // Gives current time

        // // DATE TIME

        // LocalDateTime ldt = LocalDateTime.now();
        // System.out.println(ldt);

        // FORMATTING

        LocalDateTime ldt = LocalDateTime.now();
        // System.out.println("Before Formatting: " + ldt);
        // DateTimeFormatter cdt = DateTimeFormatter.ofPattern("dd/mm/yyyy /E / W");
        // String formattedDate = ldt.format(cdt);
        // System.out.println("After Formatting: " + formattedDate);

        // Output;
        /*
         * Before Formatting: 2024-04-12T19:46:33.087765100
         * After Formatting: 12/46/2024 /Fri / 2
         */

        // LocalDateTime.of(2019, 11, 1 ,4, 10, 30);

        // String n1 = defaultDateTime.format(DateTimeFormatter.ISO_DATE);
        // System.out.println("After formatting: " + n1);

        // Difference btw two dates

        // Duration.between(ldt, ldt);

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("First time");
        // String st1 = scanner.nextLine();

        // System.out.println("Second Time");
        // String st2 = scanner.nextLine();

        // LocalDateTime ldt1 = LocalDateTime.parse(st1); // Use LocalDateTime instead
        // of LocalTime
        // LocalDateTime ldt2 = LocalDateTime.parse(st2); // Use LocalDateTime instead
        // of LocalTime

        // Duration.between(ldt1, ldt2); // Calculate duration between LocalDateTime
        // objects

        // specific time zone
        /*
         * Time zone IDs are typically in the format "Area/Region" (e.g.,
         * "America/New_York", "Europe/London").
         */
        LocalDateTime currentTimeInNewYork = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current time in New York: " + currentTimeInNewYork);
    }
}
