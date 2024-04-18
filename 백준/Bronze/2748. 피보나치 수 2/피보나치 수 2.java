import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        /*
        int a = 0;
        int b = 1;
        int c = 1;
        
        if(n == 0)
            System.out.println(a);
        else if(n == 1)
            System.out.println(b);
        else {
	        for(int i = 2; i <= n; i++) {
	            c = a + b;
	            a = b;
	            b = c;
	        }
	        System.out.println(b);
        }
        */
        long [] fibonacci = new long[n + 1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }
        
        System.out.println(fibonacci[n]);
    }
}