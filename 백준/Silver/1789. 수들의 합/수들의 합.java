import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        long sum =0;
        int count=0;
        for(long i=1; i<=S; i++) {
        	count++;
        	sum+=i;
        	if(sum>S) {
        		count--;
        		break;
        	}
        }
        System.out.println(count);
    }
}