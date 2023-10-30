import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
			int a,b,sum=0;
			a=0;
			b=1;
			sum=a+b;
			for(int i=1;i<n;i++){
				sum = a+b;
				a=b;
				b=sum;
			}
		System.out.println(sum);
	}
}
