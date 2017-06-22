package cgprasanthGuvi;

import java.util.Scanner;

public class IndexOfArray {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=ss.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the array elements :");
		for(int i=0;i<n;i++){
			a[i]=ss.nextInt();
		}
		for(int i=0;i<n;i++){
			if(i==a[i]){
				System.out.println("The number is "+a[i]+" equals to its index "+i);
			}
		}
		
	}

}
