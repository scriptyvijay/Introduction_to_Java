package pattern;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        
        //Taking input 

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        //loop 
        int i = 1;
        //while loop
        while(i<=num){
            int j = 1;
            System.out.print("*");
            while(j<=num){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
