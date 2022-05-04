package pattern;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        // Loop
        int i = 1;
        while (i <= num) {
            int j = 1;
            while (j >= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
