import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int a = in.nextInt();
		int b = in.nextInt();
		int c=a;
		int d=b;
		
		while(b!=0) {
			int temp = b;
			b = a%b;
			a = temp;
		}
		
		int divisor = a;
		
		System.out.println(divisor);
		int multiple = c*d/divisor;
		
		System.out.println(multiple);
		
		in.close();
	}
}