package array;

import java.util.Scanner;

public class linearSearch {

    public static int [] takeInput (){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter "+i+"th Element: ");
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static int findNum(int arr[],int n){
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = takeInput();;
        int findN = sc.nextInt();
        int n = findNum(arr,findN);
        System.out.println("Here is the number "+ n);
        sc.close();
    }
}
