import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        
        int length = number.length();
        long front = 1;
        long back = 1;
        
        boolean found = false;
        
        for (int i = 0; i < length - 1; i++) {
            int digit = number.charAt(i) - '0';
            front *= digit;
            
            back = 1;
            for (int j = i + 1; j < length; j++) {
                digit = number.charAt(j) - '0';
                back *= digit;
            }
            
            if (front == back) {
                found = true;
                break;
            }
        }
        
        if (found)
            System.out.println("YES");
            else 
            System.out.println("NO");
    }
}
