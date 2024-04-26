import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int day[] = new int[12];
        day[0]=31;
        day[1]=28;
        day[2]=31;
        day[3]=30;
        day[4]=31;
        day[5]=30;
        day[6]=31;
        day[7]=31;
        day[8]=30;
        day[9]=31;
        day[10]=30;
        day[11]=31;
        int sum=0;
        for(int i=0; i<x-1; i++) {
        	sum+=day[i];
        }
        sum+=y;
        if (sum%7==1)
        	System.out.print("MON");
        else if (sum%7==2)
        	System.out.print("TUE");
        else if (sum%7==3)
        	System.out.print("WED");
        else if (sum%7==4)
        	System.out.print("THU");
        else if (sum%7==5)
        	System.out.print("FRI");
        else if (sum%7==6)
        	System.out.print("SAT");
        else
        	System.out.print("SUN");
    }
}