import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    	int T = Integer.parseInt(br.readLine());
        
        while(T>0) {
        	
        	T--;
        	br.readLine();
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int N  = Integer.parseInt(st.nextToken());
        	int M = Integer.parseInt(st.nextToken());
        	
        	int S;
        	int sB=0;
        	int B;
        	int bB=0;
        	st = new StringTokenizer(br.readLine());
	        for(int i=0; i<N; i++) {
	        	S = Integer.parseInt(st.nextToken());
	        	if(S>sB)
	        		sB=S;
	        }
	        st = new StringTokenizer(br.readLine());
	        for(int i=0; i<M; i++) {
	        	B = Integer.parseInt(st.nextToken());
	        	if(B>bB)
	        		bB=B;
	        }
	        if(sB>bB)
	        	System.out.println("S");
	        else if(sB<bB)
	        	System.out.println("B");
	        else
	        	System.out.println("S");
        }
        br.close();
    }
}
