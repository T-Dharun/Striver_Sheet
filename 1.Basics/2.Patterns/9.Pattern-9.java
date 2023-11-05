class A{
    static int i=0;
    static void pattern(int n,int c){    
        for(i=0;i<n;i++){
            int a=i;
            int b=(2*(n-1-i))+1;
            if(c==0){
                a= n-i-1;
                b=(2*i)+1;
            }
            for(int j=0;j<a;j++)
                System.out.print(" ");
            for(int j=0;j<b;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
public class Solution {
    public static void nStarDiamond(int n) {
  
        A.pattern(n,0);
        A.pattern(n,1);
    }
}

/*
Pattern - 9

  *
 ***
*****
*****
 ***
  *

*/