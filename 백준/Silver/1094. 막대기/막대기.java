import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  X = Integer.parseInt(br.readLine());
        int sum = 0;
        int n=64;
        int count=1;
        while(true) {
        	sum+=n;
        	if(sum>X) {
        		sum-=n;
        		n/=2;
        	}
        	else if(sum==X)
        		break;
        	else
        	{
        		count++;
        		n/=2;
        	}
        }
        System.out.println(count);
    }
}
