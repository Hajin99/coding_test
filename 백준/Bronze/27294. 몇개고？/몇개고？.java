import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int S = scanner.nextInt();
        
        int count = calculateRiceCount(T, S);

        System.out.println(count);

        scanner.close();
    }

    private static int calculateRiceCount(int T, int S) {
        if (T >= 12 && T <= 16 && S == 0) {
            return 320;
        } else {
            return 280;
        }
    }
}