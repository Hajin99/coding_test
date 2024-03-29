import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine()) ;
    	
	    int A = Integer.parseInt(st.nextToken()); 
	    int B = Integer.parseInt(st.nextToken());
	    int V = Integer.parseInt(st.nextToken());
		int day=0;
		
		//day = (V - B -1) / (A  - B)+1;
		day = (V  - B) / (A - B);
		if((V  - B) % (A - B)!=0)
			day++;
		System.out.println(day);
	}
}