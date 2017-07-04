package cgprasanthGuvi;
import java.util.Scanner;
public class Hunter72 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		String s=ss.nextLine();
		String out="";
        String[] temp=s.split(" ");
		for(int i=0;i<temp.length;i++){
			if(i%2==0){
				StringBuffer sb=new StringBuffer(temp[i]);
				out=out+sb.reverse().toString()+" ";
			}
			else{
				out=out+temp[i]+" ";
			}
			
		}
		System.out.println(out);
	}

}
