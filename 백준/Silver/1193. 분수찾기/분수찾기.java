import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int min= 1;
        int direction = -1;
        while (x > 0) {
            x -= min;
            min++;
            direction *= -1;
        }
        int start = 1;
        int end = min - start;
        for (int i = 0; i < Math.abs(x); i++) {
            start++;
            end--;
        }

        if (direction > 0)
            System.out.print(start + "/" + end);
        else
            System.out.print(end + "/" + start);
    }
}