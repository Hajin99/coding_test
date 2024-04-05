import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
    	Scanner scanner = new Scanner(System.in);
    	
    	int N = scanner.nextInt();

    	 int[] time = new int[N];
   
    	for (int i = 0; i < N; i++) {
    		time[i] = scanner.nextInt();
    		}

    	int Y = 0;
    	for (int i = 0; i < N; i++) {
    		Y += (time[i] / 30 + 1) * 10;
    	}

    	int M = 0;
    	for (int i = 0; i < N; i++) {
    		M += (time[i] / 60 + 1) * 15;
    	}

    	if (Y < M) {
    		System.out.print("Y ");
    	} 
    	else if (Y == M) {
    		System.out.print("Y M ");
    	}
    	else {
    		System.out.print("M ");
    	}
    	if (Y <= M) {
    		System.out.println(Y );
    	} 
    	else {
    		System.out.println(M);
    	}
    	scanner.close();
    }
 }
