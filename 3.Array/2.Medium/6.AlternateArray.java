public class Solution {
    public static int[] alternateNumbers(int []a) {
        int n=1,p=0;
        int len=a.length;
        int arr[]=new int[len];
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                arr[n]=a[i];
                n+=2;
            }
            else{
                arr[p]=a[i];
                p+=2;
            }
        }
        return arr;
    }
}