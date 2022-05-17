package array2;

public class binarySearch {

    public static int binarySearching(int arr[],int n){
        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]>n){
                e=mid-1;
            }else if(arr[mid]<n){
                s=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [ ] = {1,2,3,4,5,6,7,8,9,10};
        int n = binarySearching(arr,9);
        System.out.println(n);
    }
}
