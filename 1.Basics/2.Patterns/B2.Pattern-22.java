public class Solution {
    public static void getNumberPattern(int n) {
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=j;
                int left=i;
                int right=2*n-2-j;
                int bottom=2*n-2-i;
                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(right,left)));
            }
            System.out.println();
        }
    }
}

/*
Pattern - 22

4444444
4333334
4322234
4321234
4322234
4333334
4444444

*/