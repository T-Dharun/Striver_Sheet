
public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        if(n==1) return;
        for(int i=0;i<n-1;i++){
            int j=i+1;
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        bubbleSort(arr,n-1);
    }
}