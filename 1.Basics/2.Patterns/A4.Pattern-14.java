public class Solution {
    public static void nLetterTriangle(int n) {
        for(int i=0;i<n;i++){
            for(char j='A';j<='A'+i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
/*
Pattern - 14

A
A B
A B C

*/