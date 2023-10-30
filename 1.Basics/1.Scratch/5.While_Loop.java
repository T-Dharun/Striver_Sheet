import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int sum[]=new int[2];
		sum[0]=sum[1]=0;
		while(n!=0){
			int digit=n%10;
			if(digit%2==0)
				sum[0]+=digit;
			else 
				sum[1]+=digit;
			n/=10;
		}
		System.out.println(sum[0]+" "+sum[1]);
	}
}
