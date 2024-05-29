import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        BigInteger mul= BigInteger.ONE;
        
        for(int i=N; i>0; i--) {
        	mul = mul.multiply(BigInteger.valueOf(i));
        }

        System.out.println(mul);
    }
}