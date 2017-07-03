package cgprasanthGuvi;
import java.util.Scanner;
public class Hunter48 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		String str1=ss.nextLine();
		String str2=ss.nextLine();
		for(int i=0;i<str1.length()-str2.length();i++){
			 if(str1.substring(i,str2.length()+i).equals(str2)){
				System.out.println(i);
				break;
			}
			else{
				continue;
				
			}
			
		}
		if(!str1.contains(str2)){
			System.out.println("1");
		}
				
	}

}
