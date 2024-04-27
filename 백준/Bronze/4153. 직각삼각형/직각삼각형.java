import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        
        while(true) {
        	st = new StringTokenizer(br.readLine());

            BigInteger x = new BigInteger(st.nextToken());
            BigInteger y = new BigInteger(st.nextToken());
            BigInteger z = new BigInteger(st.nextToken());
            if(x.compareTo(BigInteger.ZERO) == 0 && y.compareTo(BigInteger.ZERO) == 0 && z.compareTo(BigInteger.ZERO) == 0) break;
            if(x.multiply(x).equals(y.multiply(y).add(z.multiply(z))) || y.multiply(y).equals(x.multiply(x).add(z.multiply(z))) || z.multiply(z).equals(x.multiply(x).add(y.multiply(y))))
            	System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
