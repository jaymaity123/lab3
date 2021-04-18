package ex2;
public class Mirror {
	
	public static StringBuffer getImage(String str)
	{
		StringBuffer rev = new StringBuffer(str);
		rev = rev.reverse();
		return rev;
	}

}
