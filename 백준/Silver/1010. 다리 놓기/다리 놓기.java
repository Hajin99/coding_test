import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
       
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // N이 r
            int M = Integer.parseInt(st.nextToken()); // M이 n
            
            BigInteger nPac = factorial(M);
            BigInteger nrPac = factorial(M - N);
            BigInteger rPac = factorial(N);
            
            BigInteger result = nPac.divide(nrPac.multiply(rPac));
            
            System.out.println(result);
        }
    }
    
    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}