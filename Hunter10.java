package cgprasanthGuvi;
import java.util.Scanner;
public class Hunter10 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the array length :");
		int l1=ss.nextInt();
		int l2=ss.nextInt();
		System.out.println("Enter the two integer arrays : ");
		int[] a1=new int[l1];
		int[] a2=new int[l2];
		for(int i=0;i<l1;i++){
			a1[i]=ss.nextInt();
		}
		for(int i=0;i<l2;i++){
			a2[i]=ss.nextInt();
		}
		String t1="";
		String t2="";
		for(int i=0;i<l1;i++){
			t1=t1+String.valueOf(a1[i]);
		}
		for(int i=0;i<l2;i++){
			t2=t2+String.valueOf(a2[i]);
		}
			System.out.println(t1.contains(t2));
	}

}
