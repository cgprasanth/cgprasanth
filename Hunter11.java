package cgprasanthGuvi;
import java.util.Scanner;
public class Hunter11 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		String s=ss.nextLine();
		String[] temp=s.split(" ");
		for(int i=temp.length-1;i>=0;i--){
			System.out.print(temp[i]+" ");
		}
	}
}
