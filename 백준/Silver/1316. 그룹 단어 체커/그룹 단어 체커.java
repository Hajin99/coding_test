import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            boolean[] visited = new boolean[26];
            
            char prev = word.charAt(0);
            visited[prev - 'a'] = true;
            boolean isGroupWord = true; 
            
            for (int j = 1; j < word.length(); j++) {
                char current = word.charAt(j);
                
                if (prev != current) {
                    if (visited[current - 'a']) {
                        isGroupWord = false;
                        break;
                    } else {
                        visited[current - 'a'] = true;
                    }
                }
                prev = current;
            }
            
            if (isGroupWord) {
                count++;
            }
        }
        System.out.println(count);
    }
}
