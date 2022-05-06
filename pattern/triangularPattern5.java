//Triangle Number Pattern

package pattern;

import java.util.Scanner;

public class triangularPattern5 {
    public static void main(String[] args) {
        // Taking input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Loop
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
