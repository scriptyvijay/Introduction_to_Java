package array2;

public class bubbleSort {

    public static void sortBubble(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                //compare element 
                if(arr[j]>arr[j+1]){
                    //Swap elements 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }


    public static void main(String[] args) {
        int arr[] = {5,6,7,3,9,2,1,3,5,7,4};
        sortBubble(arr);
        printArr(arr);
    }
}
