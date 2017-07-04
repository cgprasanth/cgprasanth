package cgprasanthGuvi;
import java.util.Scanner;
public class Hunter66 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		int l=ss.nextInt();
		int count=0;
		String[] arr=new String[l+1];
		for(int i=0;i<l+1;i++){
			arr[i]=ss.nextLine();
		}
		for(int i=0;i<l+1;i++){
			String temp=arr[i];
			if(temp.length()>2&&(temp.substring(0,2).equals("10")||temp.substring(0,2).equals("01"))){
				count++;
			}
		}
		System.out.println("output = "+count);
	}

}
