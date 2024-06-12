import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneId.of("UTC"));
        
        System.out.println(utcNow.getYear());
        System.out.println(utcNow.getMonthValue());
        System.out.println(utcNow.getDayOfMonth());
    }
}