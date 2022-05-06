package pattern;

import java.util.Scanner;

public class squarePattern3 {
    public static void main(String[] args) {
        // Taking input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Loop
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(n);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
