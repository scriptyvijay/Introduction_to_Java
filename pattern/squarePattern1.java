package pattern;

import java.util.Scanner;

public class squarePattern1 {
    public static void main(String[] args) {
        //Take input
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        //Loop
        int i = 1;
        while(i<=num){
            int j = 1;
            while(j<=num){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
