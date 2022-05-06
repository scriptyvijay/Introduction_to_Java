/*
Pattern 

A
BB
CCC
DDDD

*/

package pattern;

import java.util.Scanner;

public class characterPattern2 {
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
            while (j <= i) {
                System.out.print(jthChar);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
