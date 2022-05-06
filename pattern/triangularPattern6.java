//Reverse Number Pattern

package pattern;

import java.util.Scanner;

public class triangularPattern6 {
    public static void main(String[] args) {
        // Taking input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // lOOP
        int i = 1;
        int p = 1;
        while (i <= n) {
            int j = 1;
            p = i;
            while (j <= i) {
                System.out.print(p);
                j++;
                p--;
            }
            System.out.println();
            i++;
        }
    }
}
