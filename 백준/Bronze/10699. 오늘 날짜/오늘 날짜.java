import java.time.LocalDate;

public class Main{
    public static void main(String [] args){
        LocalDate today = LocalDate.now();
        System.out.println(today);
        //LocalDateTime now = LocalDateTime.now();
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        //System.out.println(today.format(formatter));
    }
}