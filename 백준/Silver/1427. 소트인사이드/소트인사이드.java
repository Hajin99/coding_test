import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        String s = new String(br.readLine());
        int n= s.length();
        String arr [] = new String[n];
        
        for(int i=0; i<n; i++) {
        	arr[i] = String.valueOf(s.charAt(i));
        }
        for(int i=0; i<n-1; i++) {
        	for(int j=i; j<n; j++) {
        		if(Integer.parseInt(arr[i])<Integer.parseInt(arr[j])) {
        			String tmp = arr[i];
        			arr[i]=arr[j];
        			arr[j]=tmp;
        		}
        	}
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}