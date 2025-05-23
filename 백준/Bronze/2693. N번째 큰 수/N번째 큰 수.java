import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0; i<t; i++) {
        	st=new StringTokenizer(br.readLine());
        	int [] arr = new int[10];
        	for(int j=0; j<10; j++)
        		arr[j]=Integer.parseInt(st.nextToken());
        	Arrays.sort(arr);
        	System.out.println(arr[7]);
        }
    }
}