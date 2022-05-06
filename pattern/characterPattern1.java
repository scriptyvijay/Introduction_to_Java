/*
Pattern - 

ABCD
ABCD
ABCD
ABCD
*/

package pattern;

import java.util.Scanner;

public class characterPattern1 {
    public static void main(String[] args) {
        // TAKING INPUT

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // LOOP
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print((char) ('A' + j - 1));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
