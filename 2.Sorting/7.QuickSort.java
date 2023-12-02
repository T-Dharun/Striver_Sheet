
public class Solution {
	static int partition(int a[],int l,int r){
		int pivot=a[r];
		int j=l-1;
		for(int i=l;i<r;i++){
			if(a[i]<pivot){
				j++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[j+1];
		a[j+1]=a[r];
		a[r]=temp;
		return j+1;
	}
	public static void quickSort(int[] arr,int l, int r) {
		if(l<r){
			int p=partition(arr,l,r);
			quickSort(arr,l,p-1);
			quickSort(arr,p+1,r);
		}
	}
	
}