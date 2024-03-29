import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toLowerCase();

        int[] count = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                count[index]++;
            }
        }

        int max = count[0];
        char c = 'a';
        boolean check = false;

        for (int i = 1; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                c = (char) ('a' + i); 
                check = false;
            } else if (count[i] == max) {
            	check = true;
            }
        }

        if (check) {
            System.out.println("?");
        } else {
            System.out.println(Character.toUpperCase(c));
        }
    }
}
