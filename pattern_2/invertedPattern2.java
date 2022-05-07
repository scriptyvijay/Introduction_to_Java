package pattern_2;

//Pattern
// 4444
// 333
// 22
// 1

import java.util.Scanner;

public class invertedPattern2 {
    public static void main(String[] args) {
        // Take input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Loop
        int i = 1;
        while (i <= n) {
            // Number
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print(n - i + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
