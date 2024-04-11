import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       while(true) {
    	   String number1= new String(br.readLine());
    	   if(number1.equals("0"))
    		   break;
    	   int n =number1.length();
    	   int j=0;
    	   char arr[] = new char[n];
    	   
    	   for(int i=n-1; i>=0; i--) {
    		   arr[i] = number1.charAt(j);
    		   j++;
    	   }
    	   String number2= new String(arr);
    	   if(number1.equals(number2))
    		   System.out.println("yes");
    	   else
    		   System.out.println("no");
       }
        br.close();
    }
}
