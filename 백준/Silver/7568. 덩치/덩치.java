import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
     
        int N = Integer.parseInt(br.readLine());
        int x[] = new int[N];
        int y[] = new int[N];
       for(int i=0; i<N; i++) {
    	   st= new StringTokenizer(br.readLine());
    	   x[i] = Integer.parseInt(st.nextToken());
    	   y[i] = Integer.parseInt(st.nextToken());
       }
       int rank[] = new int[N];
       int k=1;
       for(int i=0; i<N; i++) {
    	   k=1;
    	   for(int j=0; j<N; j++) {
    		   if(x[i]<x[j]&&y[i]<y[j]) {
    			   k++;
    			   rank[i]=k;
    		   }
    	   }
       }
       for(int i=0; i<N; i++) {
    	   if(rank[i]==0)
    		   System.out.print(1+" ");
    	   else
    		   System.out.print(rank[i]+" ");
       }
    }
}