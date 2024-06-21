import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int a = Integer.parseInt(br.readLine());
    	int b = Integer.parseInt(br.readLine());
    	int c = Integer.parseInt(br.readLine());
    	int d = Integer.parseInt(br.readLine());
    	
    	int sec=a+b+c+d;
    	int min = sec/60;
    	sec = sec%60;
    	System.out.println(min);
    	System.out.println(sec);
    }
}
