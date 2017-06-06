import java.util.Scanner;

public class StringReverse {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string ");
		String c=s.nextLine();
		StringBuffer str=new StringBuffer(c);
		System.out.println(str.reverse());
	}
}