package cgprasanthGuvi;
import java.util.Scanner;
public class Player36 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		String s=String.valueOf(n);
		int count=0;
		int l=s.length();
		int i=0;
		if(s.charAt(i)=='7'){
		count++;
		}
		i++;
        if(s.charAt(i)=='7'){
			count++;
			}
		i++;
		
		if(i<l && s.charAt(i)=='7'){
			count++;
		}
		i++;
		if(i<l && s.charAt(i)=='7'){
			count++;
		}
		i++;
		if(i<l && s.charAt(i)=='7'){
			count++;
		}
		i++;
		if(i<l && s.charAt(i)=='7'){
			count++;
		}
		System.out.println(n+" yields "+count);
	}

}
