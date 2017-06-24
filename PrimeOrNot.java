package cgprasanthGuvi;
import java .util.Scanner;
public class PrimeOrNot {
public static void main(String[] args){
	Scanner ss=new Scanner(System.in);
	int n=ss.nextInt();
	if(n%10!=0&&n%2!=0&&n%3!=0&&n%5!=0&&n%7!=0){
		System.out.println(n+" is prime number.");
	}
	else{
		System.out.println(n+" is not a prime number.");
	}
}
}
