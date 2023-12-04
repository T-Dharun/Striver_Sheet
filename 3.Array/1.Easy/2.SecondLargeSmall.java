public class Solution {
    static int partition(int a[],int l,int r){
        int pivot=a[r];
        int i=l-1;
        for(int j=l;j<r;j++){
            if(a[j]<pivot){
                i++;
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
        int temp=pivot;
        a[r]=a[i+1];
        a[i+1]=temp;
        return i+1;
    }
    static void quicksort(int a[],int l,int r){
        if(l<r){
            int p=partition(a,l,r);
            quicksort(a,l,p-1);
            quicksort(a,p+1,r);
        }
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        quicksort(a,0,n-1);
        int arr[]=new int[2];
        if(n==2){
            arr[0]=a[0];
            arr[1]=a[1];
        }
        else{
            arr[0]=a[n-2];
            arr[1]=a[1];
        } 
        return arr;
    }
}