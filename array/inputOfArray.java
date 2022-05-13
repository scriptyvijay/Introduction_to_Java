package array;

import java.util.Scanner;

public class inputOfArray {

    public static int[] takeInput(int[] arr){
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for(int i = 0; i<n;i++){
            System.out.println("Enter "+i+"th element ");
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        arr = takeInput(arr);
        printArray(arr);
        sc.close();
    }
}
