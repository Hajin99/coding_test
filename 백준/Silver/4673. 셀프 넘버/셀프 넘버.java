import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean arr [] = new boolean[10001];
        
        for(int i=1; i<10000; i++) {
        	int n = i;
        	int sum=n;
        	while(n!=0) {
        		sum += n % 10;
                n /= 10;
        	}
        	if(sum<=10000) {
        		arr[sum]=true;
        	}
        }
        
        for (int i = 1; i <= 10000; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }
}