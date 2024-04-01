import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		char [] arr = str.toCharArray();
		
		for(int i=0; i<N-1; i++) {
			str = br.readLine();
			for(int j = 0; j<str.length(); j++) {
				if(arr[j] != str.charAt(j)) {
					arr[j] = '?';
				}
			}
		}
		
		for(char c : arr) {
			System.out.print(c);
		}
		
		br.close();
	}
}