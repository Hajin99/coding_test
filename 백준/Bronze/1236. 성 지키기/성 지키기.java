import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
       
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int guards = 0;
        char[][] castle = new char[N][M];

        for (int i = 0; i < N; i++) {
            castle[i] = br.readLine().toCharArray();
        }

        boolean[] rowGuard = new boolean[N];
        boolean[] colGuard = new boolean[M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (castle[i][j] == 'X') {
                    rowGuard[i] = true;
                    colGuard[j] = true;
                }
            }
        }

        int rowsNoGuard = 0;
        int colsNoGuard = 0;

        for (int i = 0; i < N; i++) {
            if (!rowGuard[i]) {
            	rowsNoGuard++;
            }
        }

        for (int j = 0; j < M; j++) {
            if (!colGuard[j]) {
            	colsNoGuard++;
            }
        }

        if (rowsNoGuard == 0 && colsNoGuard == 0)
            guards = 0;
        else
            guards = Math.max(rowsNoGuard, colsNoGuard);

        System.out.println(guards);

        br.close();
    }
}
