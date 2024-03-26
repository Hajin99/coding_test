import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int n=4;
		int [] arr = new int[A];
		
		for(int i=0; i<A; i++) {
			arr[i]=in.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<A; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println(min*max);
		in.close();
	}
}