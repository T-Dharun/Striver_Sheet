import java.util.List;
import java.util.ArrayList;
public class Solution {

    static long i=1;
    static List<Long> a=new ArrayList<>();
    static long fact(long n){
        if(n==0) return 1;
        return n*fact(--n);
    }
    public static List<Long> factorialNumbers(long n) {
        long val=fact(i);
        if(val<=n){
            a.add(val);
            i++;
            factorialNumbers(n);
        }
        return a;
    }
}