import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] B = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(A);
        
        int S = 0;
        boolean[] used = new boolean[N];
        
        for (int i = 0; i < N; i++) {
            int max = 0;
            for (int j = 1; j < N; j++) {
                if (B[j] > B[max]) {
                	max = j;
                }
            }

            for (int j = 0; j < N; j++) {
                if (!used[j]) {
                    S += A[j] * B[max];
                    used[j] = true;
                    B[max] = -1;
                    break;
                }
            }
        }  
        System.out.println(S);
    }
}
