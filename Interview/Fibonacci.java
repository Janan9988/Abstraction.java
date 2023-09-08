package Interview;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);
        int n = snc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;

        if (n < 0) {
            System.out.println("The N value is negative. We cannot print it.");
        } else if (n == 0) {
            System.out.println(a);
        } else if (n == 1) {
            System.out.println(b);
        } else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(c);
        }
    }
}


