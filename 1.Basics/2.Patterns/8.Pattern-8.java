public class Solution {
    public static void nStarTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++)
                System.out.print(" ");
            for(int j=0;j<2*(n-i-1)+1;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

/*
Pattern - 8

*****
 ***
  *
  
*/