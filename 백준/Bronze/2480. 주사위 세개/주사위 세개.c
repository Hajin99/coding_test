#include <stdio.h>

int main() {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);

    int max = a > b ? (a > c ? a : c) : (b > c ? b : c);

    if (a == b && b == c) {  // 세 수가 모두 같은 경우
        printf("%d\n", 10000 + a * 1000);
    } else if (a == b || b == c || a == c) {  // 두 수가 같은 경우
        printf("%d\n", 1000 + (a == b ? a : (b == c ? b : c)) * 100);
    } else {  // 세 수가 모두 다른 경우
        printf("%d\n", max * 100);
    }

    return 0;
}