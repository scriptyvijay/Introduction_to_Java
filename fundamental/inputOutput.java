package fundamental;

import java.util.Scanner;

public class inputOutput {
    public static void main(String []args) {
        //Taking input with Scanner 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String d = sc.next();
        char e = d.charAt(0);
        sc.close();
        
        //Output
        System.out.println(a+" "+e);
    }
}
