package cgprasanthGuvi;
import java.util.Scanner;
public class Hunter68 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		int l=ss.nextInt();
		int[] arr=new int[l];
		for(int i=0;i<l;i++){
			arr[i]=ss.nextInt();
		}
		int[] diff=new int[l-1];
		int max=1;
		int t=0;
		for(int i=0,j=0;i<l-1&&j<l-1;i++,j++){
				diff[j]=Math.abs(arr[i]-arr[i+1]);
		}
		for(int i=0;i<diff.length;i++){
			if(diff[i]>max){
				max=diff[i];
				t=i;
			}
		}
		System.out.println("output = "+((arr[t]>arr[t+1])?t:t+1));
		
	}

}
