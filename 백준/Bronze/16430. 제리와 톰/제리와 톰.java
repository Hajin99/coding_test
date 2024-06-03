import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        	Scanner sc = new Scanner(System.in);
        	
        	int A = sc.nextInt();
        	int B = sc.nextInt();
        	
        	A = B-A;
        	
        	System.out.println(A + " " + B);
    }
}
