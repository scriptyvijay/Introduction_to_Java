package fundamental;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        //Take input from user

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int div = 2;

        while(div<=n/2){
            if(n%2==0){
                System.out.println("Composite");
                return;
            }
            div++;
        }

        System.out.println("Prime");
    }
}
