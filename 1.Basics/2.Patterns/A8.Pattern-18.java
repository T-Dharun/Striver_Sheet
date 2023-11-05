public class Solution {
    public static void alphaTriangle(int n) {
        for(int i=0;i<n;i++){
            char a = (char)(65+n-1);
            for(int j=0;j<=i;j++){
                System.out.print(a+" ");
                a--;
            }
            System.out.println();
        }
    }
}
/*
Pattern - 18

C
C B
C B A

*/