package cgprasanthGuvi;
import java.util.Scanner;
public class Player35 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		String s=ss.nextLine();
		String temp="";
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)==s.charAt(i+1)){
				temp=temp+s.charAt(i)+"*";
			}
			else temp=temp+s.charAt(i);
		}
		System.out.println(temp+s.charAt(s.length()-1));
	}

}
