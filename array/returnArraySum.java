package array;

import java.util.Scanner;

public class returnArraySum {

    public static int[] takeInput(int arr[]){
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static int addSum(int arr[]){
        int n = arr.length;
        int sum =0;
        for(int i = 0; i<n;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        arr=takeInput(arr);
        sum = addSum(arr);
        sc.close();
        System.out.println(sum);
    }
}
