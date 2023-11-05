public class Solution {
    public static void numberCrown(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
                System.out.print(j+1+" ");
            for(int j=0;j<2*(n-1-i);j++)
                System.out.print("  ");
            for(int j=i;j>=0;j--)
                System.out.print(j+1+" ");    
            System.out.println();
        }
    }
}
/*
Pattern - 12

1         1
1 2     2 1
1 2 3 3 2 1

*/