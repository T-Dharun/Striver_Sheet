public class Solution {
    public static int calcGCD(int n, int m){
       int a=(n>m)?m:n;
       int b=0;
       for(int i=1;i<=a;i++){
           if(n%i==0&&m%i==0)
            b=i;
       }
       return b;
    }
}