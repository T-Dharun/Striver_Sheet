public class Solution {
    static long sum=0;
    public static long sumFirstN(long n) {
        if(n==0) return 0;
        return n+sumFirstN(--n);
    }
}