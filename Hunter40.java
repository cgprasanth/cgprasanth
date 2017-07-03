package cgprasanthGuvi;
import java.util.Scanner;
public class Hunter40 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
	    int n=ss.nextInt();
	    int temp=0;
	    while(n>0){
	    	int a=n%10;
	    	temp=temp+a;
	    	n=n/10;
	    }
	    String t=String.valueOf(temp);
		StringBuffer sb=new StringBuffer(t);
		String b=sb.reverse().toString();
		int a=Integer.parseInt(b);
		if(temp==a){
			System.out.println("Sum of digits of a given number is palindrome");
		}
		else{
			System.out.println("Sum of digits of a given number is not a palindrome");
		}
	}

}
