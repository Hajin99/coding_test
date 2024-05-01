import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n=0;
        while(true) {
        	n++;
        	 int arr [] = new int[3];
        	 
        	 st = new StringTokenizer(br.readLine());
             for(int i=0; i<3; i++)
             {
             	arr[i]=Integer.parseInt(st.nextToken());
             }
             
        	if(arr[0]==0&&arr[1]==0&&arr[2]==0) break;
        	if(arr[1]==0)
        		System.out.println("Case " + n + ": " + 0);
        	else if(arr[2]%arr[1]>arr[0])
        		System.out.println("Case " + n + ": " + (arr[2]/arr[1]*arr[0]+arr[0]));
        	else System.out.println("Case " + n + ": " + (arr[2]/arr[1]*arr[0]+arr[2]%arr[1]));
        }
        }
}