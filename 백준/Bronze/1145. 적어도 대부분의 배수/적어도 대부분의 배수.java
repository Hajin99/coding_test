import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int arr [] = new int[5];
    	
    	for(int i=0; i<5; i++) {
    		arr[i]= Integer.parseInt(st.nextToken());
    	}
    	
    	int minNumber = arr[0];
        for (int i = 1; i < 5; i++) {
            if (arr[i] < minNumber) {
            	minNumber = arr[i];
            }
        }
        
        int count;
        int number = minNumber;
        while (true) {
            count = 0;
            for (int i = 0; i < 5; i++) {
                if (number % arr[i] == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println(number);
                break;
            }
            number++;
        }
        
        br.close();
    }
}