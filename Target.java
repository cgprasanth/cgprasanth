package cgprasanthGuvi;
import java.util.Scanner;
public class Target {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int l=ss.nextInt();
		int[] a=new int[l];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<l;i++){
			a[i]=ss.nextInt();
		}
		System.out.print("Enter your target : ");
		int t=ss.nextInt();
		String out=" ";
		for(int i=0;i<l-1;i++){
			for(int j=i+1;j<l;j++){
				if(a[i]+a[j]==t){
					out=out+String.valueOf(a[i])+" and "+String.valueOf(a[j]);
				}
			}
		}
		System.out.println(out+" are achieves the given target.");
	}

}
