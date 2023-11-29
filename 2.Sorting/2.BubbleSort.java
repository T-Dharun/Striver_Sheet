
public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    flag=1;
                }
            }
            if(flag==0) break;
        }
    }

}