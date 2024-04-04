import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        for(int i=0; i<3; i++) {
        	st = new StringTokenizer(br.readLine());
        	
        	int N = Integer.parseInt(st.nextToken());
        	BigInteger S = BigInteger.ZERO;
        	BigInteger n;
        	for(int j=0; j<N; j++) {
        		st = new StringTokenizer(br.readLine());
        		n = new BigInteger(st.nextToken());
        		S = S.add(n);
        	}
        	
        	if(S.equals(BigInteger.ZERO))
        		System.out.println(0);
        	else if(S.compareTo(BigInteger.ZERO)>0)
        		System.out.println("+");
        	else
        		System.out.println("-");
        }
        
    }

}