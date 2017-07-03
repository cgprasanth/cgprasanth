package cgprasanthGuvi;
import java.util.Scanner;
public class Player5 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		String roman=ss.nextLine();
		int out=0;
		int out1=0;
		int out2=0;
	   char[] temp1={'I','V','X','L','C','D','M'};
	   int[] temp2={1,5,10,50,100,500,1000};
	   int[] temp3=new int[roman.length()];
	   for(int i=0;i<roman.length();i++){
		   for(int j=0;j<7;j++){
			   if(roman.charAt(i)==temp1[j]){
				   temp3[i]=temp2[j];
			   }
		   }
	   }
	   for(int j=1;j<temp3.length-1;j++){
	   out1=temp3[0];
	   out2=temp3[temp3.length-1];
	      if(temp3[j]>=temp3[j+1]){
	         out=out+temp3[j];
	      }
	      else{
		     out=out-temp3[j];
		  }
	   }
	   if(out1<temp3[1]){
		   out=out-out1;
	   }
	   else{
		   out=out+out1;
	   }
	   System.out.println(out+out2);
	}
}
