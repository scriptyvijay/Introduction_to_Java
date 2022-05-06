/*
Pattern 

ABCD
BCDE
CDEF
DEFG

*/

package pattern;

import java.util.Scanner;

public class characterPattern3 {
    public static void main(String[] args) {
        // Taking input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Loop
        int i = 1;
        while (i <= n) {
            int j = 1;
            char jthChar = (char) ('A' + i - 1);
            while (j <= n) {
                System.out.print(jthChar);
                jthChar = (char) (jthChar + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
