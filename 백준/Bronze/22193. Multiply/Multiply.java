import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] lengths = br.readLine().split(" ");
        int N = Integer.parseInt(lengths[0]);
        int M = Integer.parseInt(lengths[1]);

        String A = br.readLine();
        String B = br.readLine();
        
        BigInteger bigA = new BigInteger(A);
        BigInteger bigB = new BigInteger(B);
        
        BigInteger result = bigA.multiply(bigB);
        
        System.out.println(result);
    }
}
