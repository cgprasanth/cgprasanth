package cgprasanthGuvi;
import java.util.Scanner;
public class Hunter64 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		int t1=0;
		int t2=0;
		int t3=0;
		int t4=0;
		int t5=0;
		if(n>500){
			t1=n/500;
		}
		n=n-(t1*500);
		if(n>100&&n<500){
			t2=n/100;
		}
		n=n-(t2*100);
		if(n>50&&n<100){
			t3=n/50;
		}
		n=n-(t3*50);
		if(n>1&&n<50){
			t4=n/10;
			t5=n%10;
		}
		System.out.println("count = "+(t1+t2+t3+t4+t5)+" currency notes");
	}

}
