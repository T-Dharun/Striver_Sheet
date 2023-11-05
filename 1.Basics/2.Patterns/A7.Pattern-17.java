public class Solution {
    public static void alphaHill(int n) {
        
        for(int i=0;i<n;i++){
            char a='A';
            for(int j=0;j<n-i-1;j++)
                System.out.print("  ");
            for(int j=0;j<2*(i)+1;j++){
                System.out.print(a+" ");
                if(j<i) a++;
                else a--;
            }
            System.out.println();
        }
    }
}
/*
Pattern - 17

    A
  A B A
A B C B A

*/