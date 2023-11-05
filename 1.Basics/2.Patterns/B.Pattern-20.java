public class Solution {
    public static void symmetry(int n) {
        for(int i=0;i<n+n-1;i++){
            int a=i+1;
            int b=(n-i-1)*2;
            if(i>=n){
                a=2*n-i-1;
                b=2*(i+1);
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
Pattern - 20


*         *
* *     * * 
* * * * * *
* *     * * 
*         *


*/