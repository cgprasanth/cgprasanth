package cgprasanthGuvi;

import java.util.Scanner;

public class Power {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the Two numbers :");
		int number=ss.nextInt();
		int power=ss.nextInt();
		int Power=(int) Math.pow(number,power);
		System.out.println("power of a given number is :"+Power);
	}

}
