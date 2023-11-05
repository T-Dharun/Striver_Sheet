public class Main
{
	public static void main(String[] args) {
	    int n=4;
		for(int i=0;i<n;i++){
		    for(int j=0;j<i;j++)
		        System.out.print(" ");
		    for(int j=0;j<n-i;j++){
		        System.out.print(i+j+1+" ");
		    }
		    System.out.println();
		}
	}
}

/*
Pattern - 23

1 2 3 4
 2 3 4
  3 4
   4
   
*/
