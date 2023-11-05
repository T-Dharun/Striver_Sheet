public class Main
{
	public static void main(String[] args) {
	    int n=4;
		for(int i=0;i<n;i++){
		    for(int j=0;j<n-i;j++)
		        System.out.print(" ");
		    for(int j=0;j<=i;j++){
		        if(j==0||j==i||i==n-1)
		        System.out.print("* ");
		        else System.out.print("  ");
		    }
		    System.out.println();
		}
	}
}

/*
Pattern - 24

   *
  * *
 *   *
* * * *

*/
