package cgprasanthGuvi;
import java.util.Scanner;
public class FirstRepeatingElement {
   public static void main(String[] args){
	   Scanner ss=new Scanner(System.in);
	   System.out.println("Enter the length of the array : ");
	   int length=ss.nextInt();
	   int[] array=new int[length];
	   int[] temp=new int[length];
	   int a=0;
	   System.out.println("Enter the elements of the array :" );
	   for(int i=0;i<length;i++){
		   array[i]=ss.nextInt();
	   }
	   for(int i=0;i<length-1;i++){
		   for(int j=i+1;j<length;j++){
			   if(array[i]==array[j]){
				   temp[a]=array[i];
				   a++;
			   }
		   }
		   
	   }
	   System.out.println("The  first repeating element in the array is "+temp[0]);
   }
}
