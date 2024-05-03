import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String s []= new String[n];
        
        for(int i=0; i<n; i++) {
        	s[i]=new String(br.readLine());
        }
        
        String tmp = new String("");
        for(int i=0; i<n-1; i++) {
        	for(int j=i+1; j<n; j++) {
        		if(s[i].length() == s[j].length() && s[i].compareTo(s[j]) > 0) {
                        tmp = s[i];
                        s[i] = s[j];
                        s[j] = tmp;
                    }
        		
        		else if(s[i].length()>s[j].length()) {
        			tmp=s[i];
        			s[i]=s[j];
        			s[j]=tmp;
        		}
        		
        	}
        }
        
        String prev = "";
        for (int i = 0; i < n; i++) {
            if (!s[i].equals(prev)) {
            	System.out.println(s[i]);
                prev = s[i];
            }
        }
    }
}