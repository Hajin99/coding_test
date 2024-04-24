import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
        int arr[]= new int[3];
        
        // 공의 여부 1이면 있는 것, 0이면 없는 것
        arr[0]=1;
        arr[1]=0;
        arr[2]=0;
        while(true) {
        	T--;
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	if(arr[a-1]==1) {
        		arr[a-1]=0;
        		arr[b-1]=1;
        	}
        	else if(arr[b-1]==1) {
        		arr[a-1]=1;
        		arr[b-1]=0;
        	}
        	else {
        		arr[a-1]=0;
        		arr[b-1]=0;
        	}
        	if(T==0)
        		break;
        }
        boolean exist = false; // 공이 있는지의 여부
        for(int i=0; i<3; i++) {
        	if(arr[i]==1) {
        		System.out.println(i+1);
        		exist = true;  // 공이 있는 경우
        	}
        }
        if(exist==false) // 공이 없다면 -1을 출력
        	System.out.println(-1);
    }
}