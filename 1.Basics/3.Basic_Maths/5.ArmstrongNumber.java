import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String str=Integer.toString(n);
		int m=n;
		int length=str.length();
		int a=0;
		while(n!=0){
			int r=n%10;
			a+= (int)Math.pow(r,length);
			n/=10;
		}
		if(a==m) System.out.println(true);
		else System.out.println(false);

	}
}
