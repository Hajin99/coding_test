import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
        	int count=0;
        	String s = br.readLine();
        	if(s.equals("#"))
        		break;
        	for(int i=0; i<s.length(); i++) {
        		if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || 
        				s.charAt(i)=='o' || s.charAt(i)=='u'
        				||s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || 
        				s.charAt(i)=='O' || s.charAt(i)=='U')
        			count++;
        	}
        	System.out.println(count);
        	
        }
    }
}