import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N =  Integer.parseInt(br.readLine());
        Random random = new Random();
        int remain=N;
        int who = 0;
        while(remain>0) {
	        who++;
	        int bring = (random.nextInt(2)==0)?1:3;
	        if(remain==2)
	        	bring=1;
	        remain-=bring;
        }   
        if(who%2==0)
        	System.out.println("CY");
        else
        	System.out.println("SK");
    }
}