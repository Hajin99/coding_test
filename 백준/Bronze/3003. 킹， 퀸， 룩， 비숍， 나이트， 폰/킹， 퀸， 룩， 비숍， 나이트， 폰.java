import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] found = new int[6];

        String[] input = reader.readLine().split(" ");

        for (int i = 0; i < 6; i++) {
            found[i] = Integer.parseInt(input[i]);
        }

        int[] result = new int[6];
        for (int i = 0; i < 6; i++) {
            result[i] = chess[i] - found[i];
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(result[i] + " ");
        }
    }
}