#include <stdio.h>

int main() {
    int a, b, c;
    
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);
    
    if (a == 60 && b == 60 && c == 60) {
        printf("Equilateral\n");
    } else if (a + b + c == 180 && (a == b || b == c || a == c)) {
        printf("Isosceles\n");
    } else if (a + b + c == 180 && (a != b && b != c && a != c)) {
        printf("Scalene\n");
    } else {
        printf("Error\n");
    }
    return 0;
}
