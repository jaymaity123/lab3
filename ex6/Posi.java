package ex6;
import java.util.Arrays;
import java.util.Scanner;
public class Posi{
	static boolean isPositive(String str)
    {
        int ab = str.length();
       
        char c[] = new char [ab];
        for (int i = 0; i < ab; i++) {
            c[i] = str.charAt(i);}
       
        Arrays.sort(c);
        for (int j = 0; j < ab; j++)
            if (c[j] != str.charAt(j)) 
                return false;
               
        return true;    
    }
     
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter String=");
        String str = sc.next();
        str = str.toLowerCase();
        if (isPositive(str))
           System.out.println("Positive");
        else
            System.out.println("Non-Positive");
           
    }
}
