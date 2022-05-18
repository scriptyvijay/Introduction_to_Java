package strings;

import java.util.Scanner;

public class checkPalindrome {

    public static boolean checkPalindromeFunc(String str){
        boolean isPalindrome = true;
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        boolean isPalindrome = checkPalindromeFunc(str);
        System.out.println(isPalindrome);
    }
}
