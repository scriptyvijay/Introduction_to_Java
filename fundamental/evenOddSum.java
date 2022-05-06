package fundamental;

import java.util.Scanner;

public class evenOddSum{
    public static void main(String[] args) {
        
        //take input 

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        sc.close();
        
        //Loop
        while(num>0){
            int digit = num%10;
            if(digit%2==0){
                evenSum = evenSum+digit;
            }
            else{
                oddSum = oddSum + digit;
            }
            num = num / 10;
        }
        System.out.println("Odd Sum is " + oddSum + " Even Sum is " + evenSum);
    }
}