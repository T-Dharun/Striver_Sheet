import java.util.*;
public class Solution {
    static void merge(int arr[],int l,int mid ,int r){
        int i=l;
        int j=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        while(i<=mid&&j<=r){
            if(arr[i]<arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }
        while(j<=r){
            temp.add(arr[j]);
            j++;
        }
        int k=l;
        for(i=0;i<temp.size();i++){
            arr[k]=temp.get(i);
            k++;
        }
    }
    public static void mergeSort(int[] arr, int l, int r){
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }

    }
}
