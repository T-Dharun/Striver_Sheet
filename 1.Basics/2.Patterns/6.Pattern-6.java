public class Solution {
    public static void nNumberTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}

/*
Pattern - 6

1 2 3 
1 2 
1

*/