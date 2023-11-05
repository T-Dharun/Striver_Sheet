public class Solution {
    public static void nStarTriangle(int n) {
        for(int i=0;i<(2*n)+1;i++){
            int a=i+1;
            if(i>=n) a=2*(n)-i-1;
            for(int j=0;j<a;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

/*

Pattern - 10

*
**
***
**
*

*/