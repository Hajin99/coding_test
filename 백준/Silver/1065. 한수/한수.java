import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static boolean isHansu(int num) {
        String s = Integer.toString(num);
        if (s.length() <= 2) {
            return true;
        }
        
        int diff = s.charAt(1) - s.charAt(0);
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) - s.charAt(i) != diff) {
                return false;
            }
        }
        return true;
    }

    public static int countHansu(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (isHansu(i)) {
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        System.out.println(countHansu(N));
    }
}
