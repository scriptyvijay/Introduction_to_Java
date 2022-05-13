package functions;

import java.util.Scanner;

public class checkPrime {

    public static boolean isPrime(int num){
        int div = 2;
        while(div<=num){
            if(num/2==0){
                return true;
            }
            div++;
        }
        
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        boolean isPrime = isPrime(n);
        System.out.println(isPrime);
    }
}
