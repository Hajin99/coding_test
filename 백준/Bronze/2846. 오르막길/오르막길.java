import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int i;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr [] = new int[n];
        
        for(i=0; i<n; i++) {
        	arr[i]=  Integer.parseInt(st.nextToken());
        }
        int max=0;
        int current=0;
        for(i=1; i<n; i++) {
        	if(arr[i]>arr[i-1]) {
        		current+=arr[i]-arr[i-1];
        	}
        	else {
        		max=Math.max(max, current);
        		current=0;
        	}
        }
        max=Math.max(max, current);
        System.out.println(max);
    }
}
