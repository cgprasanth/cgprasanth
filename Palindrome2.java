package cgprasanthGuvi;

import java.util.Scanner;

public class Palindrome2 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number1=ss.nextInt();
		int temp,number=number1;
		int reverse=0;
		while(number1>0){
			temp=number1%10;
			reverse=(reverse*10)+temp;
			number1=number1/10;
			}
		if(reverse==number){
			System.out.println(number+" is palindrome");
		}
		else{
		    System.out.println(number+" is not a palindrome");
		}
	}

}
