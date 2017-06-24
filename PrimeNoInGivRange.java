package cgprasanthGuvi;
import java.util.Scanner;
public class PrimeNoInGivRange {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the range:");
		int first=ss.nextInt();
		int last=ss.nextInt();
		int Count=0;
		for(int i=first;i<=last;i++){
		if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0)
		System.out.print(i+" ");
		}
   }
}
