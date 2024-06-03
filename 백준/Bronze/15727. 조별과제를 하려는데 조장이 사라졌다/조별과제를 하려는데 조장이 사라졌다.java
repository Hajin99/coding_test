import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        	Scanner sc = new Scanner(System.in);
        	
        	int L = sc.nextInt();
        	int m=0;
        	
        	if(L%5==0)
        		m= L/5;
        	else
        		m=L/5+1;
        	
        	System.out.println(m);
    }
}
