package cgprasanthGuvi;
import java.util.Scanner;
public class Pro15 {

	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		int l=ss.nextInt();
	    int temp=0;
		int[] arr=new int[l];
		for(int i=0;i<l;i++){
			arr[i]=ss.nextInt();
		}
		for(int i=0;i<l-1;i++){
		  for(int j=i+1;j<l;j++){
			if(arr[i]<arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
   		  }
		 }
		for(int i=0;i<l;i++){
		  System.out.println(arr[i]+" ");
		}
	}

}
