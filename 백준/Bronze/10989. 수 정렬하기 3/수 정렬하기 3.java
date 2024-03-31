import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder st = new StringBuilder();
        
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
        
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
        
		Arrays.sort(arr);
        
		for(int i = 0; i < N; i++){
			st.append(arr[i]).append('\n');
		}
 
		System.out.println(st);
	}
}
//        int tmp;
//        for(int i=0; i<arr.length-1; i++) {
//        for(int j=i+1; j<arr.length; j++) {
//        if(arr[i]>arr[j]) {
//            tmp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=tmp;
//            }
//           }
//        }