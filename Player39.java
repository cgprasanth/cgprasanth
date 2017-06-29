package cgprasanthGuvi;
import java.util.Scanner;
public class Player39 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		for(int i=0;i<n;i++){
			if(Math.pow(2,i)==n){
				System.out.println("given number is power of two");
			}
		}
	}

}
