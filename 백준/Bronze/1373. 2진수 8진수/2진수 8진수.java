import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        
        String s = br.readLine();
        int len = s.length();
        int count = 0;
        int sum = 0;
        
        for (int i = len - 1; i >= 0; i--) {
            sum += (s.charAt(i) - '0') << count;
            count++;
            
            if (count == 3 || i == 0) {
                st.append(sum);
                count = 0;
                sum = 0;
            }
        }
        
        System.out.println(st.reverse().toString());
    }
}
