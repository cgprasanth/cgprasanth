package cgprasanthGuvi;
import java.util.Scanner;
public class Hunter55 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int l=ss.nextInt();
		String t1="";
		String t2="";
		String t="";
		int[] temp=new int[l];
		int [] arr=new int[l];
		for(int i=0;i<l;i++){
			arr[i]=ss.nextInt();
		}
		System.out.println("Enter the how many elements you want to rotate");
		int d=ss.nextInt();
		for(int i=d;i<arr.length;i++){
			t1=t1+String.valueOf(arr[i]);
		}
		for(int i=0;i<d;i++){
			t2=t2+String.valueOf(arr[i]);
		}
		t=t1+t2;
		for(int i=0;i<l;i++){
			temp[i]=Integer.parseInt(t.substring(i,i+1));
		}
		for(int i=0;i<l;i++){
		System.out.print(temp[i]+" ");
		}
	}

}
