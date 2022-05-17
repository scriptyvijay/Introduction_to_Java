package array2;

public class mergeTwoArray {
 
    public static int[] mergeArray(int arr1[], int arr2[]){
        int m = arr1.length;
        int n = arr2.length;
        int arr[] = new int[m+n];
        int i=0;
        int j =0;
        int k = 0;
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            }else{
                arr[k]=arr2[j];
                j++;
                k++;
            }

            while(i<m){
                arr[k]=arr1[i];
                k++;
                i++;
            }

            while(j<n){
                arr[k]=arr2[j];
                k++;
                j++;
            }
            return arr;
        }
        return arr;
    }

    public static void printArray(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr1 []= {1,2,3,4,5,6,7,8};
        int arr2[] = {9,10,11,14,15,55};        
        int arr3[] = mergeArray(arr1, arr2);
        printArray(arr3);
    }
}
