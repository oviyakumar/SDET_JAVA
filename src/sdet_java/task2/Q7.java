package sdet_java.task2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q7 {

    public static void main(String[] args) {
        // Format y-M-d or yyyy-MM-d
        String string = "2020-04-24";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        System.out.println(date);
    }
}