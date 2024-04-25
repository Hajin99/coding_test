import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
        	int sum=2;
        	String s = br.readLine();
        	if(s == null||s.equals("0"))
        		break;
	       for(int i=0; i<s.length(); i++) {
	    	   if(s.charAt(i)=='1') {
	    		   sum+=2;
	    	   }
	    	   else if(s.charAt(i)=='0') {
	    		   sum+=4;
	    	   }
	    	   else sum+=3;
	       }
	       sum+=s.length()-1;
	       System.out.println(sum);
    }
    }
}