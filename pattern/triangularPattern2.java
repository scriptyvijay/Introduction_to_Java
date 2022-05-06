package pattern;

import java.util.Scanner;

public class triangularPattern2 {
    public static void main(String[] args) {
        // taking input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // LOOP
        int p = 1;
        int i = 1;
        while (i <= n) {
            int j = 1;
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
