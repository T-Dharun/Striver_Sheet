public class Solution {
    public static void getStarPattern(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||j==n-1||i==n-1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}

/*

Pattern - 21

****
*  *
*  *
****

*/