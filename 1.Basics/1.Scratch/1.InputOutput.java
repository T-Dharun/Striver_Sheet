import java.util.Scanner;
public class InOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char a = scan.next().charAt(0);
        if(Character.isUpperCase(a))
            System.out.println(1);
        else if(Character.isLowerCase(a))
            System.out.println(0);
        else 
            System.out.println(-1);
    }
}