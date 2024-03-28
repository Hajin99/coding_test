import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // Climbing distance per day
        int B = Integer.parseInt(st.nextToken()); // Sliding distance per night
        int V = Integer.parseInt(st.nextToken()); // Total distance to climb

        // Calculate the number of days
        int day = (V - B - 1) / (A - B) + 1;

        System.out.println(day);
    }
}
