import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int sum=0;
        
        
        for(int i=0; i<N; i++) {
        	arr[i]=Integer.parseInt(br.readLine());
        	if(arr[N-1]==arr[i])
        		sum+=arr[i];
        	else
        		sum+=arr[i]-1;
        }
       System.out.println(sum);
    }
}
