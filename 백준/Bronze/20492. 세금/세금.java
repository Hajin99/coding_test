import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long N = Long.parseLong(br.readLine());
        
        long case1Tax = N * 22 / 100;
        long case1Amount = N - case1Tax;
        
        long expense = N * 80 / 100;
        long taxableIncome = N - expense;
        long case2Tax = taxableIncome * 22 / 100;
        long case2Amount = N - case2Tax;
        
        System.out.println(case1Amount + " " + case2Amount);
    }
}
