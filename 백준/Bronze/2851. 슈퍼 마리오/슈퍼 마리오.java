import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
        int sums [] = new int[10];
        
        for(i=0; i<10; i++) {
        	int number = Integer.parseInt(br.readLine());
        	sums[i]=0;                                          
        	if(i==0)
        		sums[i] += number;
        	else
        		sums[i] += sums[i-1] + number;
        }
        
        int approximation = Math.abs(100-sums[0]); // approximation: 근사치
        int store=0;
        for( i=1; i<10; i++) {
        	 if(approximation>=Math.abs(100-sums[i])) {
        		 approximation=Math.abs(100-sums[i]);
        		 store=i;
        	 }
        }
        System.out.println(sums[store]);
    }
}
