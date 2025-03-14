import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       while(true) {
    	   int n = Integer.parseInt(br.readLine());
    	   if(n==-1)
    		   break;
    	   if (isPerfect(n)) {
               System.out.print(n + " = 1");
               for (int i = 2; i < n; i++) {
                   if (n % i == 0) {
                       System.out.print(" + " + i);
                   }
               }
               System.out.println();
            } 
    	   else
                System.out.println(n + " is NOT perfect.");
       }
       
        br.close();
    }
    
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}