class A{
    static int check(int n){
        if(n==1) return 0;
        return 1;
    }
}
public class Solution {
    public static void nBinaryTriangle(int n) {
        int var;
        for(int i=0;i<n;i++){
            if(i%2==0) var=1;
            else var=0;
            for(int j=0;j<=i;j++){
                System.out.print(var+" ");
                var=1-var;
            }
            System.out.println();
        }
    }
}
/*
Pattern - 11

1
0 1
1 0 1

*/