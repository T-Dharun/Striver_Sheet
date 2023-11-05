public class Solution {
    public static void alphaRamp(int n) {
        for(char i='A';i<'A'+n;i++){
            for(char j='A';j<=i;j++)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}


/*
Pattern - 16

A
B B
C C C

*/