#include <stdio.h>

int main() {
    int N, M;
    scanf("%d %d", &N, &M);
    
    int arr[N][M];
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            scanf("%d", &arr[i][j]);
        }
    }
    
    int K;
    scanf("%d", &K);
    
    for (int a = 0; a < K; a++) {
        int i, j, x, y;
        scanf("%d %d %d %d", &i, &j, &x, &y);
        i--; j--; x--; y--;
        int sum = 0;
        for (int p = i; p <= x; p++) {
            for (int q = j; q <= y; q++) {
                sum += arr[p][q];
            }
        }
        printf("%d\n", sum);
    }
    
    return 0;
}
