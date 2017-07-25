package pro;
import java.util.ArrayList;
public class Pro57 {
	public static void userMethod(String input1,String input2){
		ArrayList a=new ArrayList();
		ArrayList b=new ArrayList();
		boolean out=false; 
		for(int i=2;i<=input1.length();i++){
			for(int j=0;j<=input1.length()-i;j++){
				a.add(input1.substring(j,j+i));
			}
		}
		for(int i=2;i<=input2.length();i++){
			for(int j=0;j<=input2.length()-i;j++){
				b.add(input2.substring(j,j+i));
			}
		}
		for(int i=0;i<a.size();i++){
			String t1=a.get(i).toString();
			for(int j=0;j<b.size();j++){
				String t2=b.get(j).toString();
				if(t1.equals(t2)){
					out=true;
				}
			}
		}
		System.out.println(out);
	}
	public static void main(String[] args){
		userMethod("1234xyz","abxdekk123");
	}

}
