package array2;

public class insertionSort {

    public static void sortInsertion(int arr[]){
        int n = arr.length;

        for(int i =1; i<n;i++){
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void printArray(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr [] = {9,8,7,6,5,4,3,2,1};
        sortInsertion(arr);
        printArray(arr);
    }
}
