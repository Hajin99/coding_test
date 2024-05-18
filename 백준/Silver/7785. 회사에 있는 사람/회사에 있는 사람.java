import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap <String,String> map = new HashMap<>();
        
        int N =  Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
        	st = new StringTokenizer(br.readLine());
        	String name = st.nextToken();
        	String attend = st.nextToken();
        	map.put(name,attend);
        }
        
        ArrayList<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, Collections.reverseOrder());
        
        for(int i=0; i<keys.size(); i++) {
        	String name = keys.get(i);
        	String attend = map.get(name);
        	if(attend.equals("enter"))
        		System.out.println(name);
        }
}
}