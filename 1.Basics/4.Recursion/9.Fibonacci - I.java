public class Solution {
    static int i=2;
    static void fibonacci(int arr[],int a,int b,int n){
        if(i==n) return;
        arr[i]=a+b;
        i++;
        fibonacci(arr,b,a+b,n);
    }
    public static int[] generateFibonacciNumbers(int n) {
        int a[]=new int[n];
        if(n==1) a[0]=0;
        if(n==2){
            a[0]=0;
            a[1]=1;
        }
        if(n>2){
            a[0]=0;
            a[1]=1;
         fibonacci(a,0,1,n);
    }
        return a;
    }
}