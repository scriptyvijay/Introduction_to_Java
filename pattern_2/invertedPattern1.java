package pattern_2;

import java.util.Scanner;

public class invertedPattern1 {
    public static void main(String[] args) {
        // Take input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Loop
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
