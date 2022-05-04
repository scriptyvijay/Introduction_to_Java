package pattern;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input from user
        int num = sc.nextInt();
        sc.close();

        int i = 1;
        //Loop
        while(i<=num){
            int j = 1;
            while(j<=num){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
