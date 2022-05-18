package strings;

import java.util.Scanner;

public class reverseString {

    public static String stringReverse(String str){
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String reverseStr = stringReverse(str);
        System.out.println(reverseStr);
    }
}
