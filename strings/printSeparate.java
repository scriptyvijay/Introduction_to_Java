package strings;

import java.util.Scanner;

public class printSeparate {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        for(int i =0; i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
