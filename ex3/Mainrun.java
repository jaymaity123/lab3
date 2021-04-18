package ex3;
import java.util.Scanner;
import java.lang.String;
public class Mainrun extends Conso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string=");
		String stri= sc.next();
		stri=stri.toLowerCase();
		 System.out.println(alterString(stri.toCharArray()));
		
	}

}
