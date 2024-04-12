import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       int A = Integer.parseInt(st.nextToken());
       int B = Integer.parseInt(st.nextToken());
       int n=1;
       int sum=0;
       int count=0;
       
       for (int i = 1; i < A; i++) {
           count++;
           if (count == n) {
               n++;
               count = 0; 
           }
       }
       for (int i = A; i <= B; i++) {
           sum += n;
           count++;
           if (count == n) {
               n++;
               count = 0; 
           }
       }
        System.out.println(sum);
        br.close();
    }
}