package array;

import java.util.Scanner;

public class printPair {

    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i = 0; i<arr.length;i++){
            System.out.println("Enter "+ i+"th Element: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
    
    //Print function for printing all pairs 

    public static void printNum(int arr[]){
         for(int i = 0; i<arr.length-1; i++){
             for(int j = i+1; j<arr.length;j++){
                System.out.println("("+arr[i]+","+arr[j]+")");
             }
         }
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        printNum(arr);
    }
}
