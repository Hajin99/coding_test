import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
        String s = new String(br.readLine());
        int count [] = new int[10];
        
        for(int i=0; i<s.length(); i++) {
        	int n = s.charAt(i)-'0';
        	count[n]++;
        }
        int same;
        if((count[6]+count[9])%2==0) {
        	same = (count[6]+count[9])/2;
        }
        else {
        	same =  (count[6]+count[9])/2 + 1;
        }
        count[6]=same;
        count[9]=same;
        int max=count[0];
        for(int i=1; i<count.length; i++) {
        	if(count[i]>max) {
        		max=count[i];
        	}
        }
        System.out.println(max);
     }
}