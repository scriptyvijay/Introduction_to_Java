package array2;

public class selectionSort {

    public static void sortSelection(int arr[]){
        int n = arr.length;
        for(int i =0; i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int j=i; j<n;j++){
                //check Min
                if(arr[j]<min){
                    min=arr[j];
                    minIndex = j;
                }
            }
            //Swap elements 
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i]=temp;
        }
    }

    public static void printArray(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr [ ] = {5,8,2,3,5,1,9,3};
        sortSelection(arr);
        printArray(arr);
    }
}
