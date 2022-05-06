package pattern;

import java.util.Scanner;

public class triangularPattern3 {
    public static void main(String[] args) {
        // Taking input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Loop
        int p = 1;
        int i = 1;
        while (i <= n) {
            int j = 1;
            p = i;
            while (j <= i) {
                System.out.print(p);
                j++;
                p++;
            }
            System.out.println();
            i++;
        }
    }
}
