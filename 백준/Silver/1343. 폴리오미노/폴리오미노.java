import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        String ex1;
        int x = 0;

        Scanner sc = new Scanner(System.in);
        ex1 = sc.nextLine();

        while (ex1.contains("XXXX")) {
            x = ex1.indexOf("XXXX");
            for(int i = 1; i <= 4 ; i++){
                ex1 = ex1.substring(0, x) + "A" + ex1.substring(x + 1);
                x++;
            }
        }

        if (ex1.contains("XXX")) {
            ex1 = "-1";
        }

        while (ex1.contains("XX")) {
            x = ex1.indexOf("XX");
            for(int i = 1; i <= 2 ; i++){
                ex1 = ex1.substring(0, x) + "B" + ex1.substring(x + 1);
                x++;
            }
        }

        if (ex1.contains("X")) {
            ex1 = "-1";
        }

        System.out.println(ex1);
    }
}