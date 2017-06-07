package digit;

import java.util.Scanner;

public class Digit {
	public static void main(String[] args)
	{
		System.out.println("enter the integer: ");
		Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        String a=Integer.toString(number);
        StringBuffer b=new StringBuffer(a);
        System.out.println(b.reverse());        
	}

}
