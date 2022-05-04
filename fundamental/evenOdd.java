package fundamental;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        //Taking input
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        if(num%2==0){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
}
