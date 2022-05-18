package array_2D;

import java.util.Scanner;

public class rowWiseSum {

    public static int [][] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter Column: ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        for(int i=0; i<r;i++){
            for(int j=0; j<c;j++){
                System.out.print("Enter "+i+"th row "+j+" column num: ");
                arr[i][j]=sc.nextInt();
            }

        }
        sc.close();
        return arr;

    }

    public static void rowSum(int arr[][]){
        
        for(int i=0;i<arr.length;i++){
            int max = 0;
            for(int j = 0; j<arr[0].length;j++){
                max += arr[i][j];
            }
            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        int arr[][] = takeInput();
        rowSum(arr);
    }
}
