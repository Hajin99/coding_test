import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s[] = br.readLine().split("");
        int count=0;
        int count2 = 0;
        for(int i=1; i<s.length; i++) {
        	String sp=s[i-1];
        	sp = sp.concat(s[i]);
        	if(sp.equals("c=")||sp.equals("c-")||sp.equals("d-")||
        			sp.equals("lj")||sp.equals("nj")||sp.equals("s=")||sp.equals("z=")) {
        		count2++;
        	}
        }
        
        int count3=0;
        for(int i=2; i<s.length; i++) {
        	String sp=s[i-2];
        	sp = sp.concat(s[i-1]);
        	sp = sp.concat(s[i]);
        	if(sp.equals("dz=")) {
        		count2--;
        		count3++;
        	}
        }
        count = s.length - (2*count2)-(3*count3) + count2 +count3;
        System.out.println(count);
    }
}