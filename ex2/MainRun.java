package ex2;
import java.util.Scanner;
public class MainRun extends Mirror {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String=");
		String str = sc.next();
		StringBuffer rev =getImage(str);
		System.out.println(str+"|"+ rev);
	}

}
