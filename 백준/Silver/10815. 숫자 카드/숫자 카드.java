/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        int bring[]=new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            bring[i] = Integer.parseInt(st.nextToken());
        }
        
        int M = Integer.parseInt(br.readLine());
        int card[] = new int[M];
        st = new StringTokenizer(br.readLine());    
        for (int i = 0; i < M; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }
        
        boolean isSame;
        for(int i=0; i<M; i++) {
        	isSame = false;
        	for(int j=0; j<N; j++) {
        		if(bring[j]==card[i])
        			isSame=true;
        	}
        	if(isSame)
        		System.out.print(1+" ");
    		else
    			System.out.print(0+" ");
        }

    }
}

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        Map<Integer, Boolean> map = new HashMap<>(N);

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
        	map.put(Integer.parseInt(st.nextToken()), true);
        }

        int M = Integer.parseInt(br.readLine());

        int[] card = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (map.containsKey(card[i])) {
                result.append(1).append(" ");
            } else {
                result.append(0).append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }
}
