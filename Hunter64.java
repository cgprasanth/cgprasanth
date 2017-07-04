package cgprasanthGuvi;
import java.util.Scanner;
public class Hunter64 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		int t1=0,a;
		int t2=0,b;
		int t3=0,c;
		int t4=0,d;
		int t5=0;
		t1=n/500;
		a=n%500;
		t2=a/100;
		b=n%100;
		t3=b/50;
		c=b%50;
		t4=c/10;
		t5=c%10;
		System.out.println("count = "+(t1+t2+t3+t4+t5)+" currency notes");
	}

}
