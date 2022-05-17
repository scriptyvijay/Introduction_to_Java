package array;

import java.util.Scanner;

public class findLargest {

    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i =0; i<arr.length;i++){
            System.out.println("Enter "+i+"th element ");
            arr[i]= sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[ ] = takeInput();
        int lar = findMax(arr);
        System.out.println("Largest Num "+lar);

    }
}
