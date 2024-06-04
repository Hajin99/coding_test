import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(br.readLine());
        
        // 초를 추가
        c += d;
        
        // 초가 60을 넘는 경우 분으로 변환
        b += c / 60;
        c = c % 60;
        
        // 분이 60을 넘는 경우 시로 변환
        a += b / 60;
        b = b % 60;
        
        // 시가 24를 넘는 경우 24로 나눈 나머지를 사용
        a = a % 24;
        
        System.out.print(a + " " + b + " " + c);
    }
}
