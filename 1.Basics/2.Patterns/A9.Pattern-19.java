public class Solution {
    public static void symmetry(int n) {
        for(int i=0;i<n+n;i++){
            int a = n-i;
            int b = 2*i;
            if(i>=n){
                a=i-n+1;
                b=2*(2*n-(i+1));
            }
            for(int j=0;j<a;j++)
                System.out.print("* ");
            for(int j=0;j<b;j++)
                System.out.print("  ");
            for(int j=0;j<a;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
/*
Pattern -19


* * * * * *
* *     * * 
*         *
*         *
* *     * *
* * * * * * 


*/