import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String [] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            String s = br.readLine();
            String[] strings = s.split(" ");
        
            int a = Integer.parseInt(strings[0]);
            int b = Integer.parseInt(strings[1]);
        
            System.out.println(a+b);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}