import java.util.List;
public class Solution {
    static int i=0;
    public static void printNtimes(int n){
        if(i==n) return ;
        System.out.print("Coding Ninjas ");
        printNtimes(n-1);
    }
}