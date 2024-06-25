import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int col = Integer.parseInt(br.readLine());
        int sai = Integer.parseInt(br.readLine());
        
        int a2 = a+col-50;
        int b2 = b+col-50;
        int c2 = c+col-50;
        
        int min = (a2>b2)?b2:a2;
        min= (c2>min)?min:c2;
        
        a2 = a+sai-50;
        b2 = b+sai-50;
        c2 = c+sai-50;
        
        int min2 = (a2<b2)?a2:b2;
        min2 = (min2<c2)?min2:c2;
        
        System.out.println((min<min2)?min:min2);
    }
}
