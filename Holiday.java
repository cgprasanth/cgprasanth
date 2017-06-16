package cgprasanthGuvi;

import java.util.Scanner;

public class Holiday {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter a Day :");
		String input=ss.nextLine();
		String day=input.toLowerCase();
		if((day.equals("sunday"))||(day.equals("saturday"))){
			System.out.println("False");
		}
		else{
			System.out.println("True");
		}
	}

}
