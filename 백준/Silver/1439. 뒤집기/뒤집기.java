import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = new String(br.readLine());
        
        int count0 = 0; // 연속된 0의 그룹 수
        int count1 = 0; // 연속된 1의 그룹 수

        // 첫 번째 문자의 그룹 세기
        char prev = S.charAt(0);
        if (prev == '0') {
            count0++;
        } else {
            count1++;
        }

        for (int i = 1; i < S.length(); i++) {
            char current = S.charAt(i);
            if (current != prev) {
                if (current == '0') {
                    count0++;
                } 
                else {
                    count1++;
                }
                prev = current;
            }
        }
        System.out.println((count0<count1)?count0:count1);
    }
}