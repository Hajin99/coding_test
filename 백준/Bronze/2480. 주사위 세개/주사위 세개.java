import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());
        int max = Math.max(a, Math.max(b, c));
        
        if(a == b && b == c)  // 세 수가 모두 같은 경우
        System.out.print(10000 + a * 1000);
        else if(a == b || b == c || a == c)  // 두 수가 같은 경우
            System.out.print(1000 + (a == b ? a : (b == c ? b : c)) * 100);
        else  // 세 수가 모두 다른 경우
            System.out.print(max * 100);

    }
}