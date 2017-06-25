package cgprasanthGuvi;
import java.util.Scanner;
public class RemoveVowels {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		String s=ss.nextLine();
		String temp="";
		StringBuffer b=new StringBuffer(s);
		String r=b.reverse().toString();
		System.out.println(r.replaceAll("[aeiouAEIOU]",""));
	}

}
