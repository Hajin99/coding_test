import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = change(input);
        System.out.println(result);
        scanner.close();
    }

    public static String change(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) { // 대문자인 경우
                result.append((char) (((c - 'A' + 13) % 26) + 'A'));
            } else if (Character.isLowerCase(c)) { // 소문자인 경우
                result.append((char) (((c - 'a' + 13) % 26) + 'a'));
            } else { // 알파벳이 아닌 경우
                result.append(c);
            }
        }

        return result.toString();
    }
}
