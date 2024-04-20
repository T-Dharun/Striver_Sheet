class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        int a[]=new int[m+n];
        int k=0;
        int i=0,j=0;
        while(i<m&&j<n){
            if(num1[i]<num2[j]){
                a[k]=num1[i];
                i++;
                k++;
            }
            else{
                a[k]=num2[j];
                j++;
                k++;
            }
        }  
        while(i<m){
            a[k]=num1[i];
            i++;k++;
        }
        while(j<n){
            a[k]=num2[j];
            j++;k++;
        }
        for(i=0;i<a.length;i++){
            num1[i]=a[i];
        }
    }
}