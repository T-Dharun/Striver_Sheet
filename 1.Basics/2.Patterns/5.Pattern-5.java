public class Solution {
    public static void seeding(int n) {
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*

Pattern - 5

* * *
* *
*

*/