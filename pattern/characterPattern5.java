/*

Pattern 

E
DE
CDE
BCDE
ABCDE

*/

package pattern;

import java.util.Scanner;

public class characterPattern5 {
    public static void main(String[] args) {
        // Taking input

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Loop
        int i = 1;
        while (i <= n) {
            char jthChar = (char) ('A' + n - i);
            int j = 1;
            while (j <= i) {
                System.out.print(jthChar);
                jthChar = (char) (jthChar + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
