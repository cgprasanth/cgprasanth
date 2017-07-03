package cgprasanthGuvi;
import java.util.Scanner;
public class Hunter35 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		String s=ss.nextLine();
		for(int i=1;i<s.length();i++){
			if(s.length()==2 && s.charAt(0)==s.charAt(1)){
				System.out.println("given string is double string");
				break;
			}
			if(s.substring(0,i).equals(s.substring(i,i+i))){
				System.out.println("given string is double string");
				break;
			}
			else{
				continue;
			}
		}
	}

}
