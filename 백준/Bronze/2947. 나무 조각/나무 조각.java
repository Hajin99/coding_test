import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] arr = new int[5];
        
        for (int i = 0; i < 5; i++) {
        	arr[i] = Integer.parseInt(input[i]);
        }
        
        while (!isInOrder(arr)) {
            for (int i = 0; i < 4; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    
                    printArr(arr);
                }
            }
        }
    }
    
    public static boolean isInOrder(int[] arr) {
        for (int i = 0; i < 5; i++) {
            if (arr[i] != i + 1) {
                return false;
            }
        }
        return true;
    }
    
    public static void printArr(int[] arr) {
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}