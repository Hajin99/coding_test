import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Random random = new Random();
    	
    	Scanner sc = new Scanner(System.in);
    	int arr [] = new int[9];
    	int arr2 [] = new int[7];
    	boolean isSelected[] = new boolean[9];
    	
    	for(int i=0; i<9; i++) {
    		arr[i]= sc.nextInt();
    	}
    	
    	int index;
    	int sum;
    	while(true) {
    		sum=0;
	    	for(int j=0; j<7; j++) {
	    		index = random.nextInt(9);
	    		sum += arr[index];
	    		arr2[j]= arr[index];
	    	}
	    	if(sum==100)
	    		break;
    	}
    	
    	for (int i = 0; i < arr2.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[j] < arr2[min]) {
                	min = j;
                }
            }
            int temp = arr2[i];
            arr2[i] = arr2[min];
            arr2[min] = temp;
        }
    	
    	for(int i=0; i<7; i++)
    		System.out.println(arr2[i]);
    	
    }
}
