import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] words = new String[5];
        
        for (int i = 0; i < 5; i++) {
            words[i] = br.readLine();
        }
        
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (words[j].length() > i) {
                    sb.append(words[j].charAt(i));
                }
            }
        }
        
        System.out.println(sb.toString());
    }
}
