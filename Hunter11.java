package cgprasanthGuvi;
import java.util.Scanner;
public class Hunter11 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		String s=ss.nextLine();
		String temp="";
		String t="";
		String last="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				last=s.substring(0,i);
				s=s.substring(i);
				break;
			}
		}
		for(int i=s.length()-1;i>=0;i--){
			temp=s;
			if(s.charAt(i)==' '){
				t=t+s.substring(i);
				s=s.substring(0,i);
			}
		}
		System.out.println(t.substring(1)+" "+last);	
	}
}
