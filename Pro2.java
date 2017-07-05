package cgprasanthGuvi;

import java.util.Scanner;

public class Pro2 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		int input=ss.nextInt();
		int k=ss.nextInt();
		String s=String.valueOf(input);
		String ab="";
		int[] temp1=new int[s.length()];
		int[] temp2=new int[s.length()];
		int t=0;
		for(int i=0;i<s.length();i++){
			temp1[i]=Integer.parseInt(s.substring(i,i+1));
			temp2[i]=Integer.parseInt(s.substring(i,i+1));
		}
		for(int i=0;i<temp2.length-1;i++){
			for(int j=i+1;j<temp2.length;j++){
				if(temp2[i]<temp2[j]){
					t=temp2[i];
					temp2[i]=temp2[j];
					temp2[j]=t;
				}
			}
		
		}
		for(int l=0;l<k;l++){
			   for(int i=0;i<temp1.length;i++){
			      if(temp1[i]==temp2[k]){
				   temp1[i]=0;
				   break;
			      }
			   }
		}
		for(int i=0;i<temp1.length;i++){
			if(temp1[i]!=0){
		    System.out.print(temp1[i]);
			}
		}
	}

}
