import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N= Integer.parseInt(st.nextToken());
    	int M= Integer.parseInt(st.nextToken());
    	int arr [][] = new int[N][M];
    	for(int i=0; i<N; i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0; j<M; j++) {
    			arr[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	int K = Integer.parseInt(br.readLine());
    	for(int a=0; a<K; a++) {
    		st = new StringTokenizer(br.readLine());
    		int i=Integer.parseInt(st.nextToken())-1;
    		int j=Integer.parseInt(st.nextToken())-1;
    		int x=Integer.parseInt(st.nextToken())-1;
    		int y=Integer.parseInt(st.nextToken())-1;
    		int sum = 0;
    		for (int p = i; p <= x; p++) {
    			for (int q = j; q <= y; q++) {
    				sum += arr[p][q];
    			}
    		}
    		
    		System.out.println(sum);
    	}
    }
}
