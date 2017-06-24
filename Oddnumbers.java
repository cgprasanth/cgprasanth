package cgprasanthGuvi;
import java.util.Scanner;
public class Oddnumbers {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		int a=ss.nextInt();
		int b=ss.nextInt();
		for(int i=a;i<=b;i++){
			if(i%2==1){
				System.out.print(i+" ");
			}
		}
	}

}
