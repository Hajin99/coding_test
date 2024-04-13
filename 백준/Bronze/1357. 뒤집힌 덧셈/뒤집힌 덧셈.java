import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       String A = st.nextToken();
       String B = st.nextToken();
       int a = A.length(); //A의 길이 123이라면 3
       int b = B.length(); //B의 길이 100이라면 3
       char c1 [] = new char[a];
       char c2 [] = new char[b];
       for(int i=0; i<A.length(); i++) {
    	   a--;
    	   c1[i]=A.charAt(a);
       }
       for(int i=0; i<B.length(); i++) {
    	   b--;
    	   c2[i]=B.charAt(b);
       }
       a=Integer.parseInt(new String(c1));
       b=Integer.parseInt(new String(c2));
       String s = Integer.toString(a+b);
       int c = s.length();
       char c3 [] = new char[c];
       for(int i=0; i<s.length(); i++) {
    	   c--;
    	   c3[i]=s.charAt(c);
       }
       int result= Integer.parseInt(new String(c3));
       System.out.println(result);
        br.close();
    }
}
