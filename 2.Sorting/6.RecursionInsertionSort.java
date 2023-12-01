public class Solution {
    public static void insertionSort(int[] arr, int n) {
        int i=arr.length-(n-1);
        if(i==arr.length) return;
        int j=i-1;
        int key=arr[i];
        while(j>=0&&key<arr[j]){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
        insertionSort(arr,n-1);
    }
}