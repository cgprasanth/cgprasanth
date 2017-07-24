package pro;
import java .util.*;
public class Pro62 {
	public static void userMethod(String input){
		int x=0;
		ArrayList a=new ArrayList();
		ArrayList b=new ArrayList();
	for(int i=2;i<=input.length();i++){
		for(int j=0;j<=input.length()-i;j++){
			String t=input.substring(j,j+i);
			a.add(t);
		}
	}
	for(int i=0; i<a.size();i++){
		String temp=a.get(i).toString();
		String sb=new StringBuffer(temp).reverse().toString();
		if(temp.equals(sb)){
			b.add(sb);
		}
	}

		System.out.println(b.get(b.size()-1));
	
	}
	public static void main(String[] args){
		userMethod("xxmalayalamabc");
	}


}
