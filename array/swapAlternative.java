package array;

import java.util.Scanner;

public class swapAlternative {

    public static int [ ] takeInput(){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int i = 0; i<arr.length;i++){
           System.out.println("Enter "+i+"th Element: ");
           arr[i]=sc.nextInt();
       } 
       sc.close();
       return arr;
    }

    public static void swapNum(int arr[]){
        for(int i = 0; i<arr.length-1;i+=2){
            int c = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=c;
        }
    }

    public static void printNum(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        swapNum(arr);
        printNum(arr);
    }
}
