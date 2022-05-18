package array_2D;

import java.util.Scanner;

public class functions2DArray {

    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.println("Enter Columns: ");
        int c = sc.nextInt();
        int arr2[][] = new int[r][c];
        for(int i=0; i<r;i++){
            for(int j = 0; j<c;j++){
                System.out.println("Enter "+i+"th row "+ j+" th Column: ");
                arr2[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return arr2;
    }

    public static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][]=takeInput();
        printArray(arr);
    }
}
