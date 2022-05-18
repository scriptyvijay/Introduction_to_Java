package array_2D;

import java.util.Scanner;

public class inputOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.println("Enter Columns: ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter "+i+"th row "+j+"th col num: ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for(int i=0; i<r;i++){
            for(int j =0; j<c;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        
    }
}
