package fundamental;

import java.util.Scanner;

public class largestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        // Check condition 

        if(a>b){
            System.out.println("A is greater");
        }else if(a==b){
            System.out.println("Both Same");
        }else{
            System.out.println("B is greater");
        }
    }
}
