package cgprasanthGuvi;

import java.util.Scanner;

public class StringToInt {
	public static void main(String[] args){
		 Scanner ss=new Scanner(System.in);
		 System.out.println("Enter the string:");
		 String s=ss.nextLine();
		 int i=Integer.valueOf(s.charAt(0));
         System.out.println(i);
		 }
}
