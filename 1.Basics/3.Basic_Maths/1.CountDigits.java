public class Solution {
    public static int countDigits(int n){
        int count =0;
        int a=n;
        while(n!=0){
            int r=n%10;
            if(r==0){
                n/=10;
                continue;
            }
            if(a%r==0) count++;
            n/=10;
        }
        return count;
    }
}