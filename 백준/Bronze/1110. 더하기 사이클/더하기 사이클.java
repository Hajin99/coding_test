import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int n2=n;
		int p=0;
		while(true) {
			int a = n2/10;
			int b = n2%10;
			int tmp=0;
			tmp=a+b;
			tmp%=10;
			n2=b*10+tmp;
			p++;
			if(n2==n)
				break;
		}
		System.out.println(p);
	}
}