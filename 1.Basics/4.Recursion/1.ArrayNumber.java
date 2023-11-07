public class Solution {
    static int i=0;
     static void  print(int a[],int i,int n){
        if(i==n) return ;
        a[i]=i+1;
       // i++;
        print(a,++i,n);
    }
    public static int[] printNos(int x) {
        int a[]=new int[x];
        print(a,i,x);
        return a;
    }
}